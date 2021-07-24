package springiocex;

import java.util.List;
import java.util.Set;

public class EmpStatus {
	public EmpStatus() {
		System.out.println("employee status....");
	}

	private String empstatus;
	
	private List empnames;
	
	private Set<String> empadd;

	public Set<String> getEmpadd() {
		return empadd;
	}

	public void setEmpadd(Set<String> empadd) {
		this.empadd = empadd;
	}

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
