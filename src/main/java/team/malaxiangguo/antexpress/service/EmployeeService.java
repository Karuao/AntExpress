package team.malaxiangguo.antexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.dao.EmployeeDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> searchEmployeeAdmin() {
        return employeeDao.selectAllEmployee();
    }

    public List<Employee> searchEmployeeManager(int departmentId) {
        return employeeDao.selectEmployeeByOccupationId(departmentId, "(2, 3)");
    }

    public List<Employee> searchEmployeeCurior(int employeeId) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employeeDao.selectEmployeeByEmployeeId(employeeId));
        return employeeList;
    }

    public void delete(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }

    public void saveOrUpdateEmployee(Employee employee) {
        employeeDao.saveOrUpdateEmployee(employee);
    }

    public List<Integer> getMaxIntegerAndNum() {
        List<Integer> list = new ArrayList<>();
        int maxId = 0;
        int maxNum = 0;
        for (Employee employee : getAllEmployee()) {
            maxId = employee.getEmployeeId();
            maxNum++;
        }
        list.add(maxNum);
        list.add(maxId);
        return list;
    }

    public List<Employee> getAllEmployee() {
        return employeeDao.selectAllEmployee();
    }

    public void deleteEmployeeById(int employeeId) {
        employeeDao.deleteEmployeeById(employeeId);
    }

    public Employee getEmployee(String account, String password) {
        return employeeDao.selectEmployeeByInput(account, password);
    }

    public void updateEmployee(Employee e) {
        employeeDao.updateEmployee(e);
    }
}
