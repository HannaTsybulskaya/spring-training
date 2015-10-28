package service.api;

import java.util.Date;

import domain.Event;
import domain.User;

public interface IDiscountService {

    double getDiscount(User user, Event event, Date date);

}
