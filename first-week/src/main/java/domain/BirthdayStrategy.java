package domain;

import java.util.Date;

public class BirthdayStrategy extends PercentDiscountStrategy {

    @SuppressWarnings("deprecation")
    public double getDiscount(User user, Event event, Date date) {
        if (user.getBirthday().getDate() == date.getDate() && user.getBirthday().getMonth() == date.getMonth()) {
            return super.getDiscount(user, event, date);
        }
        return 0;
    }

}