package service;

import entity.User;

public class ViewExam {
	
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User user1 = new User(1, "홍길동", "gildong@gildong.com");
		User user2 = new User(2, "James", "James@James.com");
		User user3 = new User(3, "오승완", "악당@g악당.com");
		
		userService.addUser(user1);
		userService.addUser(user2);
		userService.addUser(user3);
		
		userService.listUser();
		
		userService.removeUser(2);
		
		System.out.println(userService.getUser(1));
		System.out.println("----------------------");
		System.out.println();
		
		userService.listUser();
	}
}
