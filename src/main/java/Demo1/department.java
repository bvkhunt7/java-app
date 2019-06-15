package Demo1;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToOne;

@Entity 
public class department {

	
	@Id 
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  public long id;
	  
	  public String dname;
	  
	  @ManyToMany//(mappedBy = "department")
	  private person person;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public person getPerson() {
		return person;
	}

	public void setPerson(person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "department [id=" + id + ", dname=" + dname + ", person=" + person + "]";
	}
	
	
	  
	
	  
}
