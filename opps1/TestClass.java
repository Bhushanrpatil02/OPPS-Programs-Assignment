package com.yash.opps1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class TestClass {
	
	static Logger logger = Logger.getLogger(TestClass.class.getName());
	
	public static void main(String[] args) throws ParseException {
		Department[] deptDepartments = new Department[2];
		deptDepartments[0] = new Department("Dept101", "Hr Department");
		deptDepartments[1] = new Department("Dept201", "It Department");

		String birthDate = "31/12/1993";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);

		String joinDate = "22/7/2022";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);

		String regDate = "01/02/2022";
		Date dor = new SimpleDateFormat("dd/MM/yyyy").parse(regDate);

		Employee emp = new Employee(1, "shubham", "Karvenagar", dob, 100000.00, doj, "Pune", deptDepartments[1], 78945,
				"shubham234511@gmail.com");


		Customer customer = new Customer(101, "shubham", "KarveNagar", dob, dor, "Oune", 11450, "nilumohale234511@gmail.com");
		
		logger.info("Employee Details");
		emp.printEmployeeDetails();
		logger.info("\ncustomer Details");
		customer.printCustomerDetails();
	}
}
