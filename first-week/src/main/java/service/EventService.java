package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.api.IEventService;
import dao.api.IEventDao;
import domain.Auditorium;
import domain.Event;

@Service("eventService")
public class EventService implements IEventService {

    @Autowired
    private IEventDao eventDao;

    public void create(Event event) {
        eventDao.create(event);
    }

    public void remove(String id) {
        eventDao.delete(id);
    }

    public Event getByName(String name) {
        return eventDao.getByName(name);
    }

    public List<Event> getAll() {
        return eventDao.getAll();
    }

    public List<Event> getForDateRange(Date from, Date to) {
        return eventDao.getForDateRange(from, to);
    }

    public List<Event> getNextEvents(Date to) {
        return eventDao.getNextEvents(to);
    }

    public void assignAuditorium(Event event, Auditorium auditorium, Date date) {
        // TODO Auto-generated method stub
    }

    public void setEventDao(IEventDao eventDao) {
        this.eventDao = eventDao;
    }

}
