package team.malaxiangguo.antexpress.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.service.EmployeeService;

import java.io.IOException;
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
    @RequestMapping(value="edit",method = RequestMethod.POST)
    public String edit(@RequestBody String str) throws IOException {
        System.out.println("edit");
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(str, Employee.class);
        employeeService.updateEmployee(employee);
        return "test";
    }

}
