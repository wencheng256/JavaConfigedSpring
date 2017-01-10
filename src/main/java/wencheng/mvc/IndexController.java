package wencheng.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/10 0010.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
