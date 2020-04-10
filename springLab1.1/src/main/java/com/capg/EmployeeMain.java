package com.capg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;



public class EmployeeMain {
	public static void main(String[] args) {
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	 Class configurationClass=JavaConfig.class;
     context.register(configurationClass);
     context.refresh();

     Employee employee = context.getBean(Employee.class);
     System.out.println("Details are:");
     employee.display();
     
    
	}
	
}