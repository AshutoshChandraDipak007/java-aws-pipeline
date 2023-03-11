package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Student;

@RestController
public class StudentController {

	@GetMapping("getstudent")
	public String saveStudent() {
		return "Hello world";
	}

}
