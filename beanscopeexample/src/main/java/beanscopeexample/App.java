package beanscopeexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		
	 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	  System.out.println("------------------singleton--------------------");
	 Student std=(Student)context.getBean("stud");
	 std.setStudid("18pcsa122");
	 std.setStudname("gayu");
	 std.setStudresult("pass");
	
   
	 System.out.println(std.getStudid());
	 System.out.println(std.getStudname());
	 System.out.println(std.getStudresult());
	 
	 Student stda=(Student)context.getBean("stud");
	 

	 System.out.println(stda.getStudid());
	 System.out.println(stda.getStudname());
	 System.out.println(stda.getStudresult());
	 
	
     ApplicationContext procontext = new ClassPathXmlApplicationContext("bean.xml");
	 Student student=(Student)context.getBean("students");
	 System.out.println("------------------prototype--------------------");
	 student.setStudid("15umta574");
	 student.setStudname("keerthi");
	 student.setStudresult("pass");
	
	 System.out.println(student.getStudid());
	 System.out.println(student.getStudname());
	 System.out.println(student.getStudresult());
	 
	 Student studenta=(Student)context.getBean("students");
	 
	 System.out.println(studenta.getStudid());
	 System.out.println(studenta.getStudname());
	 System.out.println(studenta.getStudresult());
	 
	}
}
