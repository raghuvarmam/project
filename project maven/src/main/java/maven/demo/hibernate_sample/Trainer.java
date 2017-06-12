package maven.demo.hibernate_sample;

import java.util.Set;

public class Trainer {
	private String trName;
	private int trExp;
	private Address trAddr;
	private Set<Technologies> trTech;
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public int getTrExp() {
		return trExp;
	}
	public void setTrExp(int trExp) {
		this.trExp = trExp;
	}
	public Address getTrAddr() {
		return trAddr;
	}
	public void setTrAddr(Address trAddr) {
		this.trAddr = trAddr;
	}
	public Set<Technologies> getTrTech() {
		return trTech;
	}
	public void setTrTech(Set<Technologies> trTech) {
		this.trTech = trTech;
	}
	

}
