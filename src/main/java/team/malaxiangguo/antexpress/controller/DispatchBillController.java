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
@RequestMapping(value = "/dispatchbill")
public class DispatchBillController {

    @Autowired
    ExpressDeliveryBillService expressDeliveryBillService;

    @RequestMapping(value = "")
    public String management() {
        return "dispatch_bill_management";
    }

    @RequestMapping(value = "search")
    @ResponseBody
    public List<ExpressDeliveryBill> search() {
        return expressDeliveryBillService.searchDispatchBill();
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillService.delete(expressDeliveryBill);
        return "success";
    }

    @RequestMapping(value = "agree", method = RequestMethod.POST)
    @ResponseBody
    public String agree(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillService.agreeDispatchBill(expressDeliveryBill);
        return "success";
    }
}
