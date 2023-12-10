package id.ac.sttindonesia.belajarspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;;

@Controller
public class MenuController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("nama", "Haris");
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
