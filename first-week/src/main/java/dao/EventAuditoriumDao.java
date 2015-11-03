package dao;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Repository;

import dao.api.IEventAuditoriumDao;
import domain.EventAuditorium;

@Repository
public class EventAuditoriumDao implements IEventAuditoriumDao {

    private Set<EventAuditorium> eventAuditoriums = new HashSet<EventAuditorium>();

    public EventAuditorium assignAuditorium(String eventId, String auditoriumId, Date date) {
        EventAuditorium eventAuditorium = new EventAuditorium(UUID.randomUUID().toString(), eventId, auditoriumId,
                truncateDate(date));
        eventAuditoriums.add(eventAuditorium);
        return eventAuditorium;
    }

    private Date truncateDate(Date date) {
        return DateUtils.truncate(date, Calendar.MINUTE);
    }

    public EventAuditorium getEventAuditorium(String eventId, String auditoriumId, Date date) {
        for (EventAuditorium eventAuditorium : eventAuditoriums) {
            if (eventAuditorium.equals(new EventAuditorium(null, eventId, auditoriumId, truncateDate(date)))) {
                return eventAuditorium;
            }
        }
        return null;
    }
}
