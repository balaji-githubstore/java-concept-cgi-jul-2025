package com.cgi.oops;

abstract class Employee
{
	public int empId;
	public String empName;
	
	
	public void printEmployeeDetail()
	{
		System.out.println(empId);
		System.out.println(empName);
	}
	
	public abstract double caculateSalary();
}

class PermanentEmployee extends Employee
{

	@Override
	public double caculateSalary() {
		// TODO Auto-generated method stub
		return 30*1000;
	}

	public void onlyPermanentEmployeeRun()
	{
		System.out.println("onlyPermanentEmployeeRun");
	}
	
}

class ContractEmployee extends Employee
{

	@Override
	public double caculateSalary() {
		// TODO Auto-generated method stub
		return 8*500;
	}
	
}
public class Demo2Abstract {

	public static void main(String[] args) {
		
		//method overriding
		Employee e=new PermanentEmployee();
		
		System.out.println(e.empId);
		System.out.println(e.empName);
		
		e.printEmployeeDetail();
		
		double output=e.caculateSalary();
		System.out.println(output);
		
		
		PermanentEmployee p=(PermanentEmployee) e;
		
		p.onlyPermanentEmployeeRun();
		
		
	}
}
