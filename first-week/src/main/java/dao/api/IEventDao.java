package dao.api;

import java.util.Date;
import java.util.List;

import domain.Event;

public interface IEventDao {

    void create(Event event);

    void delete(String id);

    Event getByName(String name);

    List<Event> getAll();

    /** returns events for specified date range (OPTIONAL) */
    List<Event> getForDateRange(Date from, Date to);

    /** returns events from now till the ‘to’ date (OPTIONAL) */
    List<Event> getNextEvents(Date to);
}
