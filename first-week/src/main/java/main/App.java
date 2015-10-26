package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.User;
import service.api.IUserService;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        IUserService userService = context.getBean("userService", IUserService.class);

        userService.register(new User("1", "Masha", "masha1@gmail.com"));
        userService.register(new User("2", "Masha", "masha2@gmail.com"));
        
        System.out.println(userService.getUsersByName("Masha"));
        System.out.println(userService.getUserByEmail("masha1@gmail.com"));
        
    }
}
