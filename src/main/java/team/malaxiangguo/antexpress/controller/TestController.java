package team.malaxiangguo.antexpress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.malaxiangguo.antexpress.bean.Select;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping("select")
    public String test() {
        return "select_test";
    }

    @RequestMapping("combobox")
    @ResponseBody
    public List<Select> combobox() {
        List<Select> selectList = new ArrayList<>();
        Select select = new Select();
        select.setValue(0);
        select.setText("00");
        selectList.add(select);
        return selectList;
    }
}
