package domain;

import java.util.Date;

public interface IDiscountStrategy {

    double getDiscount(User user, Event event, Date date);

}
