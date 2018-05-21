package team.malaxiangguo.antexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.dao.EmployeeDao;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public Employee[] getEmployee(int employeeId) {

        return employeeDao.selectEmployeeById(employeeId);
    }
    public boolean getEmployee(String account,String password) {

        return employeeDao.selectEmployeeByInput(account,password);
    }
}
