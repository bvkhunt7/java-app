package Demo1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id @GeneratedValue
	private int lid;
	private String lbrand;
	private int lprice;
	
	@ManyToOne
	private Human human;
	//private List<Human> hu = new ArrayList<Human>();
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLbrand() {
		return lbrand;
	}
	public void setLbrand(String lbrand) {
		this.lbrand = lbrand;
	}
	public int getLprice() {
		return lprice;
	}
	public void setLprice(int lprice) {
		this.lprice = lprice;
	}
	public Human getHuman() {
		return human;
	}
	public void setHuman(Human human) {
		this.human = human;
	}
	
	

}
