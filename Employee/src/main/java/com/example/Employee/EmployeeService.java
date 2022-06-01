package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
@Autowired
	EmployeeDao ed;
	public String saveDetail(List<EmployeeEntity> li) {
		return ed.saveDetail(li);
	}
	public List<EmployeeEntity> getall() {
		
		return ed.getall();
	}

}
