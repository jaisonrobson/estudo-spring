package jason.devmedia.primeiro.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
