package com.tnsif.singleinherit;

public class Citizen {
		
	
	private String name;
	private long aadhaar;
	private long phNo;
	private String city;
	private String addr;
		
	public Citizen() {
		
		System.out.println("Default Constructor");
	}
	
	public Citizen(String name, long aadhaar, long phNo, String city, String addr) {
		super();
		this.name = name;
		this.aadhaar = aadhaar;
		this.phNo = phNo;
		this.city = city;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;	
	}
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadhaar=" + aadhaar + ", phNo=" + phNo + ", city=" + city + ", addr=" + addr
				+ "]";
	}
	
	
	
}
