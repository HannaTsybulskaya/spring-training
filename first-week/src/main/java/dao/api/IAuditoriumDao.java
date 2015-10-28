package dao.api;

import java.util.List;

import domain.Auditorium;

public interface IAuditoriumDao {

    List<Auditorium> getAuditoriums();

    Integer getSeatsNumber(String auditoriumId);

    List<Integer> getVipSeats(String auditoriumId);
}
