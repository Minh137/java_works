package main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.config.AppConfig;


public class ViewExam {
	
	@Autowired
	public static void main(String[] args) {
		
		//Spring 컨텍스트 로드
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//빈 가져오기
		UserService userService = context.getBean(UserService.class);
		
		userService.listUser();
		
		userService.removeUser(2);
		
		System.out.println(userService.getUser(1));
		System.out.println("----------------------");
		System.out.println();
		
		userService.listUser();
	}
}
