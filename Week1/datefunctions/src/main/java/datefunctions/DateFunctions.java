package datefunctions;

import java.util.Date;

public class DateFunctions {
	 
//	public static void main(String args[])
//	{
//		DateFunctions df=new DateFunctions();
//		System.out.println(df.todayDate());
//	}
  public static Date todayDate()
  {
	Date date=new Date();
	return date;
	
  }
  public static boolean afterDate()
  {
	  Date date1 = new Date(2016, 11, 18);
      Date date2 = new Date(1997, 10, 27);
      boolean a = date2.after(date1);
    
      a = date1.after(date2);
       return a;
  }
  public static boolean beforeDate()
  {
	  Date date1 = new Date(2016, 11, 18);
      Date date2 = new Date(1997, 10, 27);
   
       boolean b = date1.before(date2);
       return b;
  }
}
