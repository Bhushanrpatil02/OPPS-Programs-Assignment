package com.yash.opps10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		EmployeeClass emp = new EmployeeClass();
		emp.setEmpid(1);
		emp.setEmpname("Yash");
		emp.setEmpaddress("Hinjwadi");
		emp.setEmpsalary(55000);

		String dob="02/06/1998";
		Date dobb = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		emp.setEmp_dob(dobb);
		
		String doj="17/08/2022";
		Date doj1 = new SimpleDateFormat("dd/MM/yyyy").parse(doj);
		emp.setEmp_doj(doj1);
		System.out.println(emp);
		
	}

}
