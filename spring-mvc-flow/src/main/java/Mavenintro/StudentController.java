package Mavenintro;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/student")
public class StudentController {

	
	@RequestMapping(method=RequestMethod.GET)
	public String getStudent(Model model) {
		
		Student student = new Student();
		model.addAttribute("message",student);
		return "student-login";
		
	}
	@RequestMapping(method=RequestMethod.POST)
	public String studetnDetails(@Valid @ModelAttribute Student sc,BindingResult br, Model model) {
		model.addAttribute("message", "hey welcome " + sc.getName());
		if(br.hasErrors()) {
			
			return "student-login";
		}
		return "success";
		
	}
}
