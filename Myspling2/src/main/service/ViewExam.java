package main.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.entity.User;

public class ViewExam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		UserService userService = (UserService) context.getBean("userService");
		
		User user1 = new User(1, "홍길동", "gildong@gildong.com");
		User user2 = new User(2, "James", "James@James.com");
		User user3 = new User(3, "오승완", "악당@g악당.com");
		
		
		userService.listUser();
		
		userService.removeUser(2);
		
		System.out.println(userService.getUser(1));
		System.out.println("----------------------");
		System.out.println();
		
		userService.listUser();
	}
}
