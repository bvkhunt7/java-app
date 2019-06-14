package Demo1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class person {

	
	@Id 
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private long id;
	   
	  private String pname;
	  
	  @OneToOne
	  @JoinColumn (name="DEPT_ID") 
	  private department department;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public department getDepartment() {
		return department;
	}

	public void setDepartment(department department) {
		this.department = department;
	}
	
	
	  
	  
	  
	  
}
