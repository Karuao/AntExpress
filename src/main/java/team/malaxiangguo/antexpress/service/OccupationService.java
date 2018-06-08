package team.malaxiangguo.antexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.malaxiangguo.antexpress.bean.Occupation;
import team.malaxiangguo.antexpress.dao.OccupationDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class OccupationService {
    
    @Autowired
    OccupationDao occupationDao;

    public List<Occupation> searchOccupation() {
        return occupationDao.selectOccupation();
    }

    public void delete(Occupation occupation) {
        occupationDao.deleteOccupation(occupation);
    }

    public void saveOrUpdateOccupation(Occupation occupation) {
        occupationDao.saveOrUpdateOccupation(occupation);
    }

    public List<Integer> getMaxIntegerAndNum() {
        List<Integer> list = new ArrayList<>();
        int maxId = 0;
        int maxNum = 0;
        for (Occupation occupation : searchOccupation()) {
            maxId = occupation.getOccupationId();
            maxNum++;
        }
        list.add(maxNum);
        list.add(maxId);
        return list;
    }
}
