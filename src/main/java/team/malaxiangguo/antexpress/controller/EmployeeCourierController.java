package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("employeecourier")
public class EmployeeCourierController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("")
    public String management() {
        return "employee_courier";
    }

    @RequestMapping("search")
    @ResponseBody
    public List<Employee> search(int employeeId) {
        return employeeService.searchEmployeeCourier(employeeId);
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public String edit(Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
        return "success";
    }
}
