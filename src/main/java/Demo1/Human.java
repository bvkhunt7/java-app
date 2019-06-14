package Demo1;



import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Human {

	
	@Id @GeneratedValue
	private int hid;
	
	private String hname;
	//@OneToMany(mappedBy = "human",fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "human")
    private Collection<Laptop> laps = new ArrayList<Laptop>();

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

	public Collection<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	} 
	
	
	
}
