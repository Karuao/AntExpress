package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.service.EmployeeService;

import java.util.List;

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


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
        Employee e = employeeService.getEmployee(name, password);
        if (e!=null) {
            if(e.getOccupationId()==1)
                return "home_admin";
            else if (e.getOccupationId()==2)
                return "home_manager";
            else
                return "home_courier";
        } else {
            return "fail";
        }
    }


}
