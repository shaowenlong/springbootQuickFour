package com.swl.springbootfour.quick;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class qucikController {

    @RequestMapping("quick9")
    @ResponseBody
    public String qucik9() {
        return "初始化项目";
    }
}
