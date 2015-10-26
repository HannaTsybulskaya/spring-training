package domain;

import java.util.Date;

public class Event {

    private String id;
    private String name;
    private Date date;
    private String basePrice;
    private String rating;

    public Event() {
        // default
    }

    public Event(String id, String name, Date date, String basePrice, String rating) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.basePrice = basePrice;
        this.rating = rating;
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

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
