package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.ExpressDeliveryBill;
import team.malaxiangguo.antexpress.service.ExpressDeliveryBillService;

import java.util.List;

@Controller
@RequestMapping(value = "workingsheet")
public class WorkingSheetController {

    @Autowired
    ExpressDeliveryBillService expressDeliveryBillService;
    
    @RequestMapping(value = "")
    public String management() {
        return "working_sheet";
    }

    @RequestMapping(value = "search")
    @ResponseBody
    public List<ExpressDeliveryBill> search(int employeeId) {
        return expressDeliveryBillService.searchWorkingSheet(employeeId);
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public String edit(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillService.modifyWorkingSheet(expressDeliveryBill);
        return "success";
    }

    @RequestMapping(value = "revoke", method = RequestMethod.POST)
    @ResponseBody
    public String revoke(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillService.revokeWorkingSheet(expressDeliveryBill);
        return "success";
    }
}
