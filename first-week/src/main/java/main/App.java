package main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.DiscountService;
import service.api.IAuditoriumService;
import service.api.IEventService;
import service.api.IUserService;
import domain.Event;
import domain.User;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        IUserService userService = context.getBean("userService", IUserService.class);

        userService.register(new User("1", "Masha", "masha1@gmail.com", new Date()));
        userService.register(new User("2", "Masha", "masha2@gmail.com", new Date()));

        User user = userService.getUserByEmail("masha1@gmail.com");
        System.out.println(user);
        System.out.println(userService.getUsersByName("Masha"));

        IEventService eventService = context.getBean("eventService", IEventService.class);
        Event event = new Event("1234", "Event1", new Date(), 30, "high", null);
        eventService.create(event);

        System.out.println(context.getBean("auditoriumService", IAuditoriumService.class).getAuditoriums());

        System.out.println(context.getBean("discountService", DiscountService.class).getStrategies().get(0)
                .getDiscount(user, event));
    }
}
