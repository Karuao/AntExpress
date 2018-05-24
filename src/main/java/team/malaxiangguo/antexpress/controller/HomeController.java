package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("employee")
    @ResponseBody
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @RequestMapping("test")
    public String test() {
        return "test";
    }
    @RequestMapping(value="delete",method = RequestMethod.POST )
    public String delete(@RequestParam("employeeId") int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "test";
    }
    @RequestMapping(value="edit",method = RequestMethod.POST )
    public String edit(@RequestBody String e) {
        System.out.println("edit");
        System.out.println(e);
        return "test";
    }

}
