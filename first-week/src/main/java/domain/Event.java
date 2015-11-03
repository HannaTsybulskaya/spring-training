package domain;

public class Event {

    private String id;
    private String name;
    private double basePrice;
    private String rating;

    public Event() {
        // default
    }

    public Event(String id, String name, double basePrice, String rating) {
        this.id = id;
        this.name = name;
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

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", basePrice=" + basePrice + ", rating=" + rating + "]";
    }

}
