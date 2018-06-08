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
@RequestMapping(value = "employeemanager")
public class EmployeeManagerController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "")
    public String manage() {
        return "employee_manager";
    }

    @RequestMapping("search")
    @ResponseBody
    public List<Employee> search(int departmentId) {
        return employeeService.searchEmployeeManager(departmentId);
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public String edit(Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
        return "success";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(Employee employee) {
        employeeService.delete(employee);
        return "success";
    }

    @RequestMapping(value = "getMaxIdAndNum", method = RequestMethod.POST)
    @ResponseBody
    public List<Integer> getMaxIdAndNum() {
        return employeeService.getMaxIntegerAndNum();
    }
}
