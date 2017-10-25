package Mavenintro;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	/*
	 * http://localhost:8080/spring-mvc-1
     */

			@RequestMapping(method=RequestMethod.GET)
			public String printWelcome(ModelMap model) {
			
			model.addAttribute("message", "HelloWorld, This is Santosh");
			return "Welcome";
		}
			
			@RequestMapping(value = "test",method=RequestMethod.GET)
			public String test(ModelMap model) {
			
			model.addAttribute("message", "HelloWorld, This is Santoshtest");
			return "Welcome";
		}
			
			@RequestMapping(value = "other/somethingelse",method=RequestMethod.GET)
			public String printother(ModelMap model) {
			
			model.addAttribute("message", "HelloWorld, This is Santoshtestother page");
			model.addAttribute("newattribute","hello somethign");
			return "something";
		}
			
		}
