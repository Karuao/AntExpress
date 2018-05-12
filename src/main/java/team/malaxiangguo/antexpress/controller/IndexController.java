package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.service.EmployeeService;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/employee")
    @ResponseBody
    public Employee getEmployee(int employeeId) {
        return employeeService.getEmployee(employeeId);
    }
}
