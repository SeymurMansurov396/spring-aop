package com.seymur;

import com.seymur.model.Employee;
import com.seymur.service.EmployeeDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDaoImpl employeeDao;
	private static  final Logger logger= LoggerFactory.getLogger(SpringAopApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		logger.warn("Run method starts");

	}
}
