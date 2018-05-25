package team.malaxiangguo.antexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.dao.EmployeeDao;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAllEmployee() {
        return employeeDao.selectAllEmployee();
    }

    public void deleteEmployeeById(int employeeId){
        employeeDao.deleteEmployeeById(employeeId);
    }
    public Employee getEmployee(String account,String password) {
        return employeeDao.selectEmployeeByInput(account,password);
    }
    public  void updateEmployee(Employee e){
         employeeDao.updateEmployee(e);
    }
}
