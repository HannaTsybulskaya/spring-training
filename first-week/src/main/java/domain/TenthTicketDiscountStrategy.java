package domain;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import dao.api.IBookingDao;

public class TenthTicketDiscountStrategy extends PercentDiscountStrategy {

    @Autowired
    private IBookingDao bookingDao;

    @Override
    public double getDiscount(User user, Event event, Date date) {
        int count = bookingDao.getBookedTickets(user).size();
        if (count >= 9 && count % 10 == 9) {
            return super.getDiscount(user, event, date);
        }
        return 0;
    }
}
