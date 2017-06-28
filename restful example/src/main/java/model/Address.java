package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Address {

    @Id@GeneratedValue
    @Column(name ="ADDR_ID")
    private Integer addressId;
    @Column(name = "ST_CITY")
    private String city;
    @Column(name = "PH_NO")
    private Integer phoneNumber;
    @Column(name = "EMAIL_ADDRS")
    private String emailAddress;
    
    
	public Address() {
	}
	public Address(Integer addressId, String city, Integer phoneNumber, String emailAddress) {
		this.addressId = addressId;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

    
   
}
