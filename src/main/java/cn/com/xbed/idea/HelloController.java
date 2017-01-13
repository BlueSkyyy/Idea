package cn.com.xbed.idea;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tom on 17-1-12.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "welcome";
    }
}
