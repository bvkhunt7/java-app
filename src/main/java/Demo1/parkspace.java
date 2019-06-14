package Demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class parkspace {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	    private int lot;
	    private String location;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getLot() {
			return lot;
		}
		public void setLot(int lot) {
			this.lot = lot;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	    
	    
	    

}
