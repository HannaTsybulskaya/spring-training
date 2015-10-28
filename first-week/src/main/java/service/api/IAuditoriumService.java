package service.api;

import java.util.List;

import domain.Auditorium;

public interface IAuditoriumService {

    List<Auditorium> getAuditoriums();

    Integer getSeatsNumber(String auditoriumId);

    List<Integer> getVipSeats(String auditoriumId);

}
