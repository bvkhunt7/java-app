package Demo2;
//import java.util.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;

@Entity
public class laptop {
	
	
	@Id @GeneratedValue
	private int lid;
	
	public String lname;
	
	@ManyToMany
	private List<student> student = new ArrayList<student>();

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<student> getStudent() {
		return student;
	}

	public void setStudent(List<student> student) {
		this.student = student;
	}
	
	

}
