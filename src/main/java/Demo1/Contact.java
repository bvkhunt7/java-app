package Demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class Contact {
	

	@Id @GeneratedValue
	private int cid;

	private int cno;
	
	@ManyToOne
	private Per per;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public Per getPer() {
		return per;
	}

	public void setPer(Per per) {
		this.per = per;
	}

	
}
