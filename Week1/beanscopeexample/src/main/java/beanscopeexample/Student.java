package beanscopeexample;

public class Student {
	private String studid;
    private String studname;
    private String studresult;
	public String getStudid() {
		return studid;
	}
	public void setStudid(String studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getStudresult() {
		return studresult;
	}
	public void setStudresult(String studresult) {
		this.studresult = studresult;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", studresult=" + studresult + "]";
	}
    
    
}
