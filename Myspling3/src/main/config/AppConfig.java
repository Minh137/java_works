package main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import main.entity.User;

// User1, User2 등의 클래스가 존재한다고 가정
@Configuration
@ComponentScan(basePackages = "main")
public class AppConfig {

	  // 여러 사용자 빈을 등록
    @Bean
    public User user1() {
        return new User(1, "홍길동", "gildong@gildong.com");
    }

    @Bean
    public User user2() {
        return new User(2, "James", "james@james.com");
    }

    @Bean
    public User user3() {
        return new User(3, "오승완", "악당@악당.com");
    }

}