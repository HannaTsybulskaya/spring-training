package dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import dao.api.IBookingDao;
import domain.BookedTicket;
import domain.Ticket;
import domain.User;

@Repository
public class BookingDao implements IBookingDao {

    private Set<BookedTicket> bookedTickets = new HashSet<BookedTicket>();

    public BookedTicket bookTicket(String userId, Ticket ticket) {
        BookedTicket bookedTicket = new BookedTicket(userId, ticket);
        bookedTickets.add(bookedTicket);
        return bookedTicket;
    }

    public List<BookedTicket> getTicketsForEvent(String eventAudId) {
        List<BookedTicket> result = new ArrayList<BookedTicket>();
        for (BookedTicket bookedTicket : bookedTickets) {
            if (bookedTicket.getTicket().getEventAudId().equals(eventAudId)) {
                result.add(bookedTicket);
            }
        }
        return result;
    }

    public List<BookedTicket> getBookedTickets(User user) {
        List<BookedTicket> result = new ArrayList<BookedTicket>();
        for (BookedTicket bookedTicket : bookedTickets) {
            if (bookedTicket.getUserId().equals(user.getId())) {
                result.add(bookedTicket);
            }
        }
        return result;
    }
}
