package team.malaxiangguo.antexpress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("select")
    public String test() {
        return "select_test";
    }

}
