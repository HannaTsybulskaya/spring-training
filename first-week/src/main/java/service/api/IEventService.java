package service.api;

import java.util.Date;
import java.util.List;

import domain.Auditorium;
import domain.Event;

public interface IEventService {

    void create(Event event);

    void remove(String id);

    Event getByName(String name);

    List<Event> getAll();

    /** returns events for specified date range (OPTIONAL) */
    List<Event> getForDateRange(Date from, Date to);

    /** returns events from now till the ‘to’ date (OPTIONAL) */
    List<Event> getNextEvents(Date to);

    /** assign auditorium for event for specific date */
    void assignAuditorium(Event event, Auditorium auditorium, Date date);
}
