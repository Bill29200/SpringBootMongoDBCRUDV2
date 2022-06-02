package Fr.SII.SpringMongoCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Fr.SII.SpringMongoCRUD.model.Person;
import Fr.SII.SpringMongoCRUD.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	//......................................................................
	//                    Create	
	//......................................................................
	@RequestMapping("/create")
	public String create(@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age) {
		Person p = personService.create(firstName, lastName, age);
		return p.toString();		
	}
	//......................................................................	
	//                    Read	
	//......................................................................
	@RequestMapping("/get")
	public Person getPerson(@RequestParam String firstName) {
		return personService.getByFirstName(firstName);
	}
	@RequestMapping("/count")
	public Long count() {
		return personService.count();
	}
	//......................................................................
	@RequestMapping("/getAll")
	public List<Person> getAll() {
		return personService.getAll();
	}
	//......................................................................
	//                 Update	
	//......................................................................
	@RequestMapping("/update")
	public String update(@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age) {
		Person p = personService.update(firstName, lastName, age);
		return p.toString();		
	}
	//......................................................................	
	//                 Delete	
	//......................................................................
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstName) {
		 personService.delete(firstName);
		return "Deleted "+firstName;		
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		 personService.deleteAll();
		return "Deleted all records";		
	}
	//......................................................................
	//......................................................................
	//......................................................................	
	//......................................................................	
	//......................................................................	
	//......................................................................	
	//......................................................................
	//......................................................................

}
