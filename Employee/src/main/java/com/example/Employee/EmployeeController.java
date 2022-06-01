package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/saveall")
	public String saveDetail(@RequestBody List<EmployeeEntity> li) {
		return es.saveDetail(li);
	}
	@GetMapping(value="/getall")
	public List<EmployeeEntity> getall() {
		return es.getall();
	}
	


}
