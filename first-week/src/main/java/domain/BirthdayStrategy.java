package domain;

import static java.util.Calendar.DAY_OF_MONTH;
import static org.apache.commons.lang3.time.DateUtils.truncate;

import java.util.Calendar;

import org.apache.commons.lang3.time.DateUtils;

public class BirthdayStrategy extends PercentDiscountStrategy {

    public double getDiscount(User user, Event event) {
        if (truncate(user.getBirthday(), DAY_OF_MONTH).equals(
                DateUtils.truncate(event.getDate(), Calendar.DAY_OF_MONTH))) {
            return super.getDiscount(user, event);
        }
        return 0;
    }

}
