package com.autowireex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");  
	    System.out.println("using byName");
	   Example msg= (Example) context.getBean("msg",Example.class);  
	   msg.display();  
	   System.out.println(msg.getMessage());
	   System.out.println(msg.getEstatus().getStatus());
	   
	   System.out.println("----------------------------------------------");
	   System.out.println("using byType");
	   ExampleA a= (ExampleA) context.getBean("a",ExampleA.class);  
	   a.display();  
	   System.out.println(a.getMessage());
	   System.out.println(a.getEstatus().getStatus());
	}  
}
