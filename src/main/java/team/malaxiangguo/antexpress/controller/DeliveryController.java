package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team.malaxiangguo.antexpress.bean.ExpressDeliveryBill;
import team.malaxiangguo.antexpress.service.ExpressDeliveryBillService;

import java.util.Random;

@Controller
@RequestMapping("/")
public class DeliveryController {

    @Autowired
    ExpressDeliveryBillService expressDeliveryBillService;

    @RequestMapping(value = "delivery", method = RequestMethod.GET)
    public String toDelivery() {
        return "delivery";
    }

    @RequestMapping(value = "delivery", method = RequestMethod.POST)
    public String Delivery(ExpressDeliveryBill e, Model model) {
        String str = "AE";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str = str + random.nextInt(10);
        }
        e.setTrackingNo(str);
        e.setStatus("Dispatch Bill");
        expressDeliveryBillService.save(e);
        model.addAttribute("tracking_no",e.getTrackingNo());
        return "deliverySuccess";
    }
}
