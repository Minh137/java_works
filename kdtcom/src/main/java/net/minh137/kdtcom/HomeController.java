package net.minh137.kdtcom;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
				
		return "kdtcom.main";
	}
	
	@GetMapping("/admin")
	public String adminHome(Model model) {
		return "kdtcom.admin";
	}
	
}
