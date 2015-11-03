package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.api.IAuditoriumService;
import service.api.IBookingService;
import service.api.IDiscountService;
import dao.api.IBookingDao;
import dao.api.IEventAuditoriumDao;
import domain.BookedTicket;
import domain.Event;
import domain.EventAuditorium;
import domain.Ticket;
import domain.User;

@Service
public class BookingService implements IBookingService {

    private final static double HIGH_RATE_KOEFF = 0.2;
    private final static String HIGH_RATE = "high";

    @Autowired
    private IBookingDao bookingDao;
    @Autowired
    private IEventAuditoriumDao eventAuditoriumDao;
    @Autowired
    private IAuditoriumService auditoriumService;
    @Autowired
    private IDiscountService discountService;

    public Ticket getTicketPrice(Event event, String auditoriumId, Date date, int seat, User user) {
        EventAuditorium eventAuditorium = eventAuditoriumDao.getEventAuditorium(event.getId(), auditoriumId, date);
        if (eventAuditorium != null) {
            double price = event.getBasePrice();
            if (auditoriumService.getVipSeats(eventAuditorium.getAuditoriumId()).contains(seat)) {
                price += event.getBasePrice();
            }
            if (HIGH_RATE.equals(event.getRating())) {
                price += event.getBasePrice() * HIGH_RATE_KOEFF;
            }
            price -= discountService.getDiscount(user, event, date);
            return new Ticket(eventAuditorium.getId(), seat, price);
        }
        return null;
    }

    public BookedTicket bookTicket(String userId, Ticket ticket) {
        return bookingDao.bookTicket(userId, ticket);
    }

    public List<BookedTicket> getTicketsForEvent(String eventId, String auditoriumId, Date date) {
        EventAuditorium eventAuditorium = eventAuditoriumDao.getEventAuditorium(eventId, auditoriumId, date);
        return bookingDao.getTicketsForEvent(eventAuditorium.getId());
    }

}
