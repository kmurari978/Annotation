package com.krishna.lab;

public class Lab {
public static void main(String[] args)throws CloneNotSupportedException    {
	Emp emp=new Emp(99,"Krishna");
	System.out.println(emp);
	Emp emp1=emp.getClonedObject();
	System.out.println(emp1);
	System.out.println(emp==emp1);
}
}
