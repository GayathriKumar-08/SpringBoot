package springiocex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	 public static void main( String[] args )
	    {
	        
	        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

	        Employee emp = (Employee)context.getBean("employee");
	        

	        
	        System.out.println(emp.getEmpid()+" "+emp.getEmpname());
//	        System.out.println(emp.getEmpname());
	         System.out.println(emp.getEstatus().getEmpstatus());
	         System.out.println(emp.getEstatus().getEmpnames());
	         System.out.println("--------------------------------------------------------------");
//	         System.out.println("Bean Life cycle");
	         ((AbstractApplicationContext) context).registerShutdownHook();
	    }
}
