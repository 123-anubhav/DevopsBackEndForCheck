package in.arpit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import in.arpit.model.Student;
import in.arpit.repository.StudentRepository;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private StudentRepository stuRepo;

	@GetMapping("/getData")
	public ResponseEntity<Student> getData() {
		List<Student> findAll = stuRepo.findAll();
		return new ResponseEntity(findAll, HttpStatus.OK);
	}

}
