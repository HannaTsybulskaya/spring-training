package domain;

public class PercentDiscountStrategy implements IDiscountStrategy {

    protected double discountPercent = 0;

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscount(User user, Event event) {
        return event.getBasePrice() / 100 * discountPercent;
    }

    @Override
    public String toString() {
        return "PercentDiscountStrategy [discountPercent=" + discountPercent + "]";
    }

}
