package Demo1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Per {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	
	private String pname;
	@OneToMany(mappedBy = "per",fetch = FetchType.EAGER)
    private List<Contact> laps = new ArrayList<Contact>();
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
	public List<Contact> getLaps() {
		return laps;
	}
	public void setLaps(List<Contact> laps) {
		this.laps = laps;
	}
	
	


}
