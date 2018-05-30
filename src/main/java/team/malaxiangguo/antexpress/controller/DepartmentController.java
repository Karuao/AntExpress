package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Department;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.bean.ExpressDeliveryBill;
import team.malaxiangguo.antexpress.service.DepartmentService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "")
    public String management() {
        return "department";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(Department department) {
        departmentService.delete(department);
        return "success";
    }

    @RequestMapping(value = "getMaxIdAndNum", method = RequestMethod.POST)
    @ResponseBody
    public List<Integer> getMaxIdAndNum() {
        List<Integer> list = new ArrayList<>();
        int maxId = 0;
        int maxNum = 0;
        for (Department department : departmentService.searchDepartment()) {
            maxId = department.getDepartmentId();
            maxNum++;
        }
        list.add(maxNum);
        list.add(maxId);
        return list;
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Department department) {
        departmentService.saveOrUpdateDepartment(department);
        return "success";
    }
}
