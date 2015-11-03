package domain;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class EventAuditorium {

    private String id;
    private String eventId;
    private String auditoriumId;
    private Date date;

    public EventAuditorium() {
        // default
    }

    public EventAuditorium(String id, String eventId, String auditoriumId, Date date) {
        this.id = id;
        this.eventId = eventId;
        this.auditoriumId = auditoriumId;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getAuditoriumId() {
        return auditoriumId;
    }

    public void setAuditoriumId(String auditoriumId) {
        this.auditoriumId = auditoriumId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(auditoriumId).append(date).append(eventId).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventAuditorium other = (EventAuditorium) obj;
        return new EqualsBuilder().append(auditoriumId, other.auditoriumId).append(date, other.date)
                .append(eventId, other.eventId).isEquals();
    }

}
