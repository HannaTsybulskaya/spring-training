package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.api.IAuditoriumDao;
import domain.Auditorium;
import service.api.IAuditoriumService;

@Service("auditoriumService")
public class AuditoriumService implements IAuditoriumService {

    @Autowired
    private IAuditoriumDao auditoriumDao;

    public List<Auditorium> getAuditoriums() {
        return auditoriumDao.getAuditoriums();
    }

    public Integer getSeatsNumber(String auditoriumId) {
        return auditoriumDao.getSeatsNumber(auditoriumId);
    }

    public List<Integer> getVipSeats(String auditoriumId) {
        return auditoriumDao.getVipSeats(auditoriumId);
    }

}
