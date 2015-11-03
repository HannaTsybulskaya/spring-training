package domain;

public class Ticket {

    private String eventAudId;
    private int seat;
    private double price;

    public Ticket() {
        // default
    }

    public Ticket(String eventAudId, int seat, double price) {
        this.eventAudId = eventAudId;
        this.seat = seat;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEventAudId() {
        return eventAudId;
    }

    public void setEventAudId(String eventAudId) {
        this.eventAudId = eventAudId;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Ticket [eventAudId=" + eventAudId + ", seat=" + seat + ", price=" + price + "]";
    }

}
