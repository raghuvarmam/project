package maven.demo.hibernate_sample;

public class Student {
	private String sNAme;;
	private String education;
	private Address stAddr;
	public String getsNAme() {
		return sNAme;
	}
	public void setsNAme(String sNAme) {
		this.sNAme = sNAme;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Address getStAddr() {
		return stAddr;
	}
	public void setStAddr(Address stAddr) {
		this.stAddr = stAddr;
	}
	

}
