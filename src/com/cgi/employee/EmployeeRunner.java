package com.cgi.employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee.companyName="CGI";
		Employee.companyLocation="Chennai";
		
		Employee emp1 = new Employee(101);
		Employee emp2 = new Employee(102,"jack");
		Employee emp3 = new Employee("john",103);
		Employee emp4=new Employee(104);
		

		
	
		
//		Employee emp4= Employee.getEmployeeInstance();

		emp1.empId = 101;
		emp1.empName = "saul";
		emp1.empPerformance="Excellent";
		emp1.empSalary=9000;
				
		emp2.empId = 102;
		emp2.empName = "peter";
		emp2.empPerformance="Average";
		emp2.empSalary=5000;

		emp3.printEmployeeDetails();
		Employee.printEmployeeDetails1(emp2);
		
		emp2.printEmployeeDetails();
		
	}

}
