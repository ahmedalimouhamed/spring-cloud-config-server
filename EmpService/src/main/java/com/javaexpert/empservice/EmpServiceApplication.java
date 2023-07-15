package com.javaexpert.empservice;

import java.util.List;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpServiceApplication.class, args);
	}
	
	@GetMapping("/getEmpList")
	public List<String> getEmpList(){
		List<String> emp = new ArrayList<String>();
		emp.add("java");
		emp.add("c#");
		emp.add("c++");
		return emp;
	}

}
