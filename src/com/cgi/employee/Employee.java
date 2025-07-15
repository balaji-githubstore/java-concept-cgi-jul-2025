package com.cgi.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSalary;
	public String empPerformance;
	public static String companyName;
	public static String companyLocation;
	

	
	public Employee(int empId)
	{
		System.out.println("launch browser!!!");
		this.empId=empId;
	}
	
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	public Employee(String empName,int empId)
	{
		this(empId,empName);
		
	}
	
	
	public void printEmployeeDetails()
	{
		System.out.println(this.empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(empPerformance);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyLocation);
		System.out.println("---------------------------------");
	}
	
	public static void printEmployeeDetails1(Employee e)
	{
		System.out.println(e.empId);
		System.out.println(e.empName);
		System.out.println(e.empSalary);
		System.out.println(e.empPerformance);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyLocation);
		System.out.println("---------------------------------");
	}
	
//	public static Employee getEmployeeInstance()
//	{
//		Employee e=new Employee();
//		return e;
//	}
}






