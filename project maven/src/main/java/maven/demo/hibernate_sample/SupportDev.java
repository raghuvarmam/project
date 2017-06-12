package maven.demo.hibernate_sample;

import java.util.Set;

public class SupportDev {
	private String sdName;
	private Set<Technologies> sdTech;
	private int sdExp;
	private Address sdAddr;
	public String getSdName() {
		return sdName;
	}
	public void setSdName(String sdName) {
		this.sdName = sdName;
	}
	public Set<Technologies> getSdTech() {
		return sdTech;
	}
	public void setSdTech(Set<Technologies> sdTech) {
		this.sdTech = sdTech;
	}
	public int getSdExp() {
		return sdExp;
	}
	public void setSdExp(int sdExp) {
		this.sdExp = sdExp;
	}
	public Address getSdAddr() {
		return sdAddr;
	}
	public void setSdAddr(Address sdAddr) {
		this.sdAddr = sdAddr;
	}
	
	
}
