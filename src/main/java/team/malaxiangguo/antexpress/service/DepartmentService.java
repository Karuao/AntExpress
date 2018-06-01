package team.malaxiangguo.antexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.malaxiangguo.antexpress.bean.Department;
import team.malaxiangguo.antexpress.dao.DepartmentDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    public List<Department> searchDepartment() {
        return departmentDao.selectDepartment();
    }

    public void delete(Department department) {
        departmentDao.deleteDepartment(department);
    }

    public void saveOrUpdateDepartment(Department department) {
        departmentDao.saveOrUpdateDepartment(department);
    }

    public List<Integer> getMaxIntegerAndNum() {
        List<Integer> list = new ArrayList<>();
        int maxId = 0;
        int maxNum = 0;
        for (Department department : searchDepartment()) {
            maxId = department.getDepartmentId();
            maxNum++;
        }
        list.add(maxNum);
        list.add(maxId);
        return list;
    }
}
