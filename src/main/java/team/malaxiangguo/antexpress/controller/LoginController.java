package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.service.EmployeeService;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping("test")
    public String test() {
        return "test";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
        if (employeeService.getEmployee(name, password)) {
            return "home";
        } else {
            return "fail";
        }
    }

    @RequestMapping("employee")
    @ResponseBody
    public Employee[] getEmployee(int employeeId) {
        return employeeService.getEmployee(employeeId);
    }
}
