package service;

import java.util.Date;
import java.util.List;

import domain.Event;
import domain.IDiscountStrategy;
import domain.User;
import service.api.IDiscountService;

public class DiscountService implements IDiscountService {

    private List<IDiscountStrategy> strategies;

    public double getDiscount(User user, Event event, Date date) {
        // TODO Auto-generated method stub
        return 0;
    }

    public void setStrategies(List<IDiscountStrategy> strategies) {
        this.strategies = strategies;
    }

    public List<IDiscountStrategy> getStrategies() {
        return strategies;
    }

}
