package dao.api;

import java.util.Date;

import domain.EventAuditorium;

public interface IEventAuditoriumDao {

    EventAuditorium assignAuditorium(String eventId, String auditoriumId, Date date);

    EventAuditorium getEventAuditorium(String eventId, String auditoriumId, Date date);

}
