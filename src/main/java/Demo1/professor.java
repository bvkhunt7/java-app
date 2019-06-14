package Demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class professor {
	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	  private String pname;
	  private long psalary;
	  
	  @OneToOne 
	  @JoinColumn(name="PSPACE_ID") 
	  private parkspace parkspace;
	  
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPsalary() {
		return psalary;
	}
	public void setPsalary(long psalary) {
		this.psalary = psalary;
	}
	public parkspace getParkspace() {
		return parkspace;
	}
	public void setParkspace(parkspace parkspace) {
		this.parkspace = parkspace;
	}
	  
	  
	
	  

}
