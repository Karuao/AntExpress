package team.malaxiangguo.antexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Occupation;
import team.malaxiangguo.antexpress.service.OccupationService;

import java.util.List;

@Controller
@RequestMapping(value = "/occupation")
public class OccupationController {
    
    @Autowired
    OccupationService occupationService;

    @RequestMapping(value = "")
    public String management() {
        return "occupation";
    }

    @RequestMapping(value = "search")
    @ResponseBody
    public List<Occupation> search() {
        return occupationService.searchOccupation();
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public String edit(Occupation occupation) {
        occupationService.saveOrUpdateOccupation(occupation);
        return "success";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(Occupation occupation) {
        occupationService.delete(occupation);
        return "success";
    }

    @RequestMapping(value = "getMaxIdAndNum", method = RequestMethod.POST)
    @ResponseBody
    public List<Integer> getMaxIdAndNum() {
        return occupationService.getMaxIntegerAndNum();
    }
}
