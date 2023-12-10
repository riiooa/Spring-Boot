package id.ac.sttindonesia.belajarspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;;

@Controller
public class PendaftaranController {

    @GetMapping("/pendaftaran")
    public String pendaftaran(){
        return "pendaftaran";
    }
}
