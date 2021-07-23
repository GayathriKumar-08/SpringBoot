package springiocex;

public class Employee {
	private String empid;
	private String empname;

	public Employee(String empdesig, String source) {
		System.out.println("Employee designation is: " + empdesig + " " + source);
	}

	private EmpStatus estatus;

	

	public EmpStatus getEstatus() {
		return estatus;
	}

	public void setEstatus(EmpStatus estatus) {
		this.estatus = estatus;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	 public void init(){
	      System.out.println("Bean is going to do some initialization work.");
	   }
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }

}
