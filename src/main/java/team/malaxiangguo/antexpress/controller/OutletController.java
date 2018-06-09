package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Outlet;
import team.malaxiangguo.antexpress.service.OutletService;

import java.util.List;

@Controller
@RequestMapping(value = "/outlet")
public class OutletController {
    
    @Autowired
    OutletService outletService;

    @RequestMapping(value = "")
    public String management() {
        return "outlet";
    }

    @RequestMapping(value = "search")
    @ResponseBody
    public List<Outlet> search() {
        return outletService.searchOutlet();
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public String edit(Outlet outlet) {
        outletService.saveOrUpdateOutlet(outlet);
        return "success";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(Outlet outlet) {
        outletService.delete(outlet);
        return "success";
    }

    @RequestMapping(value = "getMaxIdAndNum", method = RequestMethod.POST)
    @ResponseBody
    public List<Integer> getMaxIdAndNum() {
        return outletService.getMaxIntegerAndNum();
    }
}
