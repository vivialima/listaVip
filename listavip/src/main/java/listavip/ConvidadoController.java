package listavip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadoController {
 
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/convidados")
	public String convidados() {
		return "convidados";
	}
}
