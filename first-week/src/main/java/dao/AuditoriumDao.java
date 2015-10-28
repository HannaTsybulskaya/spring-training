package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import dao.api.IAuditoriumDao;
import domain.Auditorium;

@Service("auditoriumDao")
public class AuditoriumDao implements IAuditoriumDao {

    private Map<String, Auditorium> map = new HashMap<String, Auditorium>();

    public List<Auditorium> getAuditoriums() {
        return new ArrayList<Auditorium>(map.values());
    }

    public Integer getSeatsNumber(String auditoriumId) {
        return map.get(auditoriumId).getNumberOfSeats();
    }

    public List<Integer> getVipSeats(String auditoriumId) {
        return map.get(auditoriumId).getVipSeats();
    }

    public void setMap(Map<String, Auditorium> map) {
        this.map = map;
    }

}
