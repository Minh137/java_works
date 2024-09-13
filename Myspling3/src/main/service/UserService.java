package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import main.entity.User;


public class UserService {
	@Autowired
	private List<User> users;

	//유지삭제
	public void addUser(User user) {
		users.add(user);
		System.out.println(user.getName()+"님이 추가 되었습니다.");
		System.out.println("----------------------");
		System.out.println();
	}
	
	public void removeUser(int id) {
		users.removeIf( user -> user.getId()==id);
		System.out.println("유저 아이디"+id+"님이 삭제 되었습니다.");
		System.out.println("----------------------");
		System.out.println();
	}
	
	public User getUser(int id) {
		return users.stream().filter(user->user.getId() == id).findFirst().orElse(null);
	}
	
	
	public void listUser() {
		users.forEach(System.out::println);
		System.out.println("----------------------");
		System.out.println();
	}
}
