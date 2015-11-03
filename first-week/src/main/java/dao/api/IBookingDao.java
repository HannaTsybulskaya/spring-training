package dao.api;

import java.util.List;

import domain.BookedTicket;
import domain.Ticket;
import domain.User;

public interface IBookingDao {

    BookedTicket bookTicket(String userId, Ticket ticket);

    List<BookedTicket> getTicketsForEvent(String eventAudId);

    List<BookedTicket> getBookedTickets(User user);

}
