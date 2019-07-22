package com.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionsClass 
{
public static void main(String args[])
{
	Employee employee=new Employee();
	employee.id=10;
	employee.salart=900;
	Employee employee1=new Employee();
	employee1.id=10;
	employee1.salart=900;
	List<Employee> list=new ArrayList<>();
	list.add(employee1);
	list.add(employee1);
	for(Employee emp:list)
	{
		System.out.println(emp);
		
	}
	
}
}
class Employee
{
	int salart;
	int id;
	
	
}
