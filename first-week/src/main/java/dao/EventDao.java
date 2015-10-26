package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.api.IEventDao;
import domain.Event;

public class EventDao implements IEventDao {

    private Map<String, Event> events = new HashMap<String, Event>();

    public void create(Event event) {
        events.put(event.getId(), event);
    }

    public void delete(String id) {
        events.remove(id);
    }

    public Event getByName(String name) {
        if (name != null) {
            for (Event event : events.values()) {
                if (name.equals(event.getName())) {
                    return event;
                }
            }
        }
        return null;
    }

    public List<Event> getAll() {
        return new ArrayList<Event>(events.values());
    }

    public List<Event> getForDateRange(Date from, Date to) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Event> getNextEvents(Date to) {
        // TODO Auto-generated method stub
        return null;
    }

}
