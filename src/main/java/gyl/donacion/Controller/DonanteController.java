
package gyl.donacion.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/donante")
public class DonanteController {

    @GetMapping("")
    public String indexDonante(){
        return "/index-donante";
    }
}
