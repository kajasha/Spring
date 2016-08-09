package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloSunshine {

    @RequestMapping("/hi")
    public String hi(@RequestParam(value="name", required=false, defaultValue="Sunshine") String name, Model model) {
        model.addAttribute("name", name);
        return "hi";
    }


}
