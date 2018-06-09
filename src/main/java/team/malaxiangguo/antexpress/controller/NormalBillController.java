package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Employee;
import team.malaxiangguo.antexpress.bean.ExpressDeliveryBill;
import team.malaxiangguo.antexpress.bean.Outlet;
import team.malaxiangguo.antexpress.service.EmployeeService;
import team.malaxiangguo.antexpress.service.ExpressDeliveryBillService;
import team.malaxiangguo.antexpress.service.OutletService;

import java.util.List;

@Controller
@RequestMapping(value = "normalbill")
public class NormalBillController {

    @Autowired
    ExpressDeliveryBillService expressDeliveryBillService;

    @Autowired
    OutletService outletService;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "")
    public String management() {
        return "normal_bill";
    }

    @RequestMapping(value = "search")
    @ResponseBody
    public List<ExpressDeliveryBill> search(int departmentId) {
        return expressDeliveryBillService.searchNormalBill(departmentId);
    }

    @RequestMapping(value = "agree", method = RequestMethod.POST)
    @ResponseBody
    public String agree(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillService.agreeNormalBill(expressDeliveryBill);
        return "success";
    }

    @RequestMapping(value = "outlet", method = RequestMethod.POST)
    @ResponseBody
    public List<Outlet> outletList(int departmentId) {
        return outletService.searchOutletByDepartmentId(departmentId);
    }

    @RequestMapping(value = "courier", method = RequestMethod.POST)
    @ResponseBody
    public List<Employee> employeeList(int outletId) {
        return employeeService.searchEmployeeByOutletId(outletId);
    }
}
