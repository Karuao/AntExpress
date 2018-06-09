package team.malaxiangguo.antexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.malaxiangguo.antexpress.bean.Outlet;
import team.malaxiangguo.antexpress.dao.OutletDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class OutletService {

    @Autowired
    OutletDao outletDao;

    public List<Outlet> searchOutlet() {
        return outletDao.selectOutlet();
    }

    public List<Outlet> searchOutletByDepartmentId(int departmentId) {
        return outletDao.selectOutletByDepartmentId(departmentId);
    }

    public void delete(Outlet outlet) {
        outletDao.deleteOutlet(outlet);
    }

    public void saveOrUpdateOutlet(Outlet outlet) {
        outletDao.saveOrUpdateOutlet(outlet);
    }

    public List<Integer> getMaxIntegerAndNum() {
        List<Integer> list = new ArrayList<>();
        int maxId = 0;
        int maxNum = 0;
        for (Outlet outlet : searchOutlet()) {
            maxId = outlet.getOutletId();
            maxNum++;
        }
        list.add(maxNum);
        list.add(maxId);
        return list;
    }
}
