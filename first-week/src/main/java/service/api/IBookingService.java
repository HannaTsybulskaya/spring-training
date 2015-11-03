package service.api;

import java.util.Date;
import java.util.List;

import domain.BookedTicket;
import domain.Event;
import domain.Ticket;
import domain.User;

public interface IBookingService {

    Ticket getTicketPrice(Event event, String auditoriumId, Date date, int seat, User userId);

    BookedTicket bookTicket(String userId, Ticket ticket);

    /**
     * Get all purchased tickets for event for specific date.
     */
    List<BookedTicket> getTicketsForEvent(String eventId, String auditoriumId, Date date);

}
