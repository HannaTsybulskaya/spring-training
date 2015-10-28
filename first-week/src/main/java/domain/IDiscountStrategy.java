package domain;


public interface IDiscountStrategy {

    double getDiscount(User user, Event event);

}
