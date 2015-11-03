package service;

import java.util.Date;
import java.util.List;

import service.api.IDiscountService;
import domain.Event;
import domain.IDiscountStrategy;
import domain.User;

public class DiscountService implements IDiscountService {

    private List<IDiscountStrategy> strategies;

    public double getDiscount(User user, Event event, Date date) {
        double discount = 0;
        for (IDiscountStrategy strategy : strategies) {
            discount += strategy.getDiscount(user, event, date);
        }
        return discount;
    }

    public void setStrategies(List<IDiscountStrategy> strategies) {
        this.strategies = strategies;
    }

    public List<IDiscountStrategy> getStrategies() {
        return strategies;
    }

}
