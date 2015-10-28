package domain;

import java.util.Date;

public class Event {

    private String id;
    private String name;
    private Date date;
    private Double basePrice;
    private String rating;
    private String auditoriumId;

    public Event() {
        // default
    }

    public Event(String id, String name, Date date, Double basePrice, String rating, String auditoriumId) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.basePrice = basePrice;
        this.rating = rating;
        this.auditoriumId = auditoriumId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAuditoriumId() {
        return auditoriumId;
    }

    public void setAuditoriumId(String auditoriumId) {
        this.auditoriumId = auditoriumId;
    }

    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", date=" + date + ", basePrice=" + basePrice + ", rating="
                + rating + ", auditoriumId=" + auditoriumId + "]";
    }

}
