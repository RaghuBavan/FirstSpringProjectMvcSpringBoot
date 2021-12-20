package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Model.Person;
@Controller
public class PersonController {
	@RequestMapping("/person")
	public String person(Model model)
	{
		Person p=new Person();
		p.setFirstname("Lakshmi");
		p.setLastname("Shekar");
		p.setAge(75);
		model.addAttribute("person",p);
		return "personview";
	} 
}
