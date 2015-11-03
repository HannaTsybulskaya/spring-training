package service;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.api.IAuditoriumService;
import service.api.IBookingService;
import service.api.IDiscountService;
import service.api.IEventService;
import service.api.IUserService;
import domain.Auditorium;
import domain.BookedTicket;
import domain.Event;
import domain.Ticket;
import domain.User;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context.xml")
public class Demo {

    private static final Date DATE_ONE = DateUtils.addDays(new Date(), 30);

    @Autowired
    private IUserService userService;
    @Autowired
    private IAuditoriumService auditoriumService;
    @Autowired
    private IDiscountService discountService;
    @Autowired
    private IEventService eventService;
    @Autowired
    private IBookingService bookingService;

    @Before
    public void before() {
        registerUsers();
        createEvents();
    }

    @Test
    public void testBookingService() {
        String audId = auditoriumService.getAuditoriums().get(0).getId();
        Event event = eventService.getByName("High rate event");
        eventService.assignAuditorium("1323", audId, Demo.DATE_ONE);
        Ticket ticket = bookingService.getTicketPrice(event, audId, DATE_ONE, 10, userService.getById("1"));
        System.out.println(ticket);
        BookedTicket bookedTicket = bookingService.bookTicket("1", ticket);
        System.out.println(bookedTicket);
        for (int i = 21; i < 40; i++) {
            ticket = bookingService.getTicketPrice(event, audId, DATE_ONE, i, userService.getById("1"));
            System.out.println(ticket);
            bookingService.bookTicket("1", ticket);
        }
        System.out.println(bookingService.getTicketsForEvent(event.getId(), audId, DATE_ONE).size());
    }

    @Test
    public void testUserService() {
        System.out.println(userService.getUserByEmail("masha1@gmail.com"));
        System.out.println(userService.getUsersByName("Masha"));
        System.out.println(userService.getById("1"));
        userService.getBookedTickets(userService.getById("1")); // / ??????
    }

    @Test
    public void testEventService() {
        eventService.assignAuditorium("1323", "1", DATE_ONE);
        System.out.println(eventService.getByName("High rate event"));
        List<Event> events = eventService.getAll();
        System.out.println(events);
    }

    @Test
    public void testDiscountService() {
        User user = new User("3", "Anna", "123@mail.com", DateUtils.addYears(DATE_ONE, -20));
        userService.register(user);
        System.out.println(discountService.getDiscount(userService.getById("3"),
                eventService.getByName("High rate event"), DATE_ONE));
    }

    @Test
    public void testAuditoriumService() {
        List<Auditorium> auditoriums = auditoriumService.getAuditoriums();
        System.out.println(auditoriums.get(0));
        System.out.println(auditoriumService.getSeatsNumber(auditoriums.get(0).getId()));
        System.out.println(auditoriumService.getVipSeats(auditoriums.get(0).getId()));
    }

    private void registerUsers() {
        userService.register(new User("1", "Masha", "masha1@gmail.com", new Date()));
        userService.register(new User("2", "Masha", "masha2@gmail.com", new Date()));
    }

    private void createEvents() {
        eventService.create(new Event("1323", "High rate event", 10, "high"));
        eventService.create(new Event("3242", "Low rate event", 50, "low"));
    }
}
