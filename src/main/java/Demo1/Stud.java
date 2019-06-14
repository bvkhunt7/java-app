package Demo1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stud {
    @Id   
	private int sid;
	private String sname;
	private int sstd;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSstd() {
		return sstd;
	}
	public void setSstd(int sstd) {
		this.sstd = sstd;
	}
	
	// fetch data
	//@Override
	//public String toString() {
	 //	return "Stud [sid=" + sid + ", sname=" + sname + ", sstd=" + sstd + "]";
	//}
	
	
}
