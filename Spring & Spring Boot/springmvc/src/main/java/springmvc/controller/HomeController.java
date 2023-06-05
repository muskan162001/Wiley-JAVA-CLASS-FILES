package springmvc.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("hello this is home url");
		model.addAttribute("name", "Muskan JAin");
		model.addAttribute("id", 43454);
		
		List<String> friends = new ArrayList < String > ();
		friends.add("njdfnj");
		friends.add("njfnrfh");
		
		model.addAttribute("f", friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");.
		return "about";
	}	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Uttam");
		modelAndView.setViewName("help");
		return modelAndView;
	}
}