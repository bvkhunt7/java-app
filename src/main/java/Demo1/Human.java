package Demo1;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity 
public class Human {

	
@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int hid;
	
	private String hname;
	@OneToMany(mappedBy = "human",fetch = FetchType.EAGER)
    private List<Laptop> laps = new ArrayList<Laptop>();

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public List<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(List<Laptop> laps) {
		this.laps = laps;
	}

	@Override
	public String toString() {
		return "Human [hid=" + hid + ", hname=" + hname + ", laps=" + laps + "]";
	} 
	
	
	
}
