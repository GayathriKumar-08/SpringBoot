package springiocex;

import java.util.List;

public class EmpStatus {
	public EmpStatus() {
		System.out.println("employee status....");
	}

	private String empstatus;
	
	private List empnames;

	public String getEmpstatus() {
		return empstatus;
	}

	public void setEmpstatus(String empstatus) {
		this.empstatus = empstatus;
	}

	public List getEmpnames() {
		return empnames;
	}

	public void setEmpnames(List empnames) {
		this.empnames = empnames;
	}
	@Override
	public String toString() {
		return "EmpStatus [empstatus=" + empstatus + ", empnames=" + empnames + "]";
	}
	

}
