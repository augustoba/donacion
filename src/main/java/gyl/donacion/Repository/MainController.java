
package gyl.donacion.Repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class MainController {
@GetMapping("")
    public String indexUser(){
        return "/index";
    }
}
