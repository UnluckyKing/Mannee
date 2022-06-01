package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository er;
	public String saveDetail(List<EmployeeEntity> li) {
		for(EmployeeEntity s:li)
			{
			er.save(s);
			}
		return "POOI VELAIYA PARU";
	}
	public List<EmployeeEntity> getall() {
		
		return er.findAll();
	}

}
