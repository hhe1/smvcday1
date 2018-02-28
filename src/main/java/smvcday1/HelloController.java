package smvcday1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	private PersonService personService;
	
	public HelloController() {
		// TODO Auto-generated constructor stub
	    System.out.println("controller construct");
	   
	}
	
	@ResponseBody
	@RequestMapping(value="/test")
	public String  getString() {
		System.out.println("-------");
		 personService.say();
		return "string";
	}
}
