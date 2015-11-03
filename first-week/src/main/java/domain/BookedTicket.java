package domain;

public class BookedTicket {

    private String userId;
    private Ticket ticket;

    public BookedTicket() {
        // default
    }

    public BookedTicket(String userId, Ticket ticket) {
        this.userId = userId;
        this.ticket = ticket;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "BookedTicket [userId=" + userId + ", ticket=" + ticket + "]";
    }

}
