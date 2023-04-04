package com.tnsif.singleinherit;

public class Student extends Citizen{
	  
	private int rollNo;
	private String clgName;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public Student(String name, long aadhaar, long phNo, String city, String addr,int rollNo,String clgName) {
		super(name, aadhaar, phNo, city, addr);
		// TODO Auto-generated constructor stub
		this.rollNo = rollNo;
		this.clgName = clgName;
	}





	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", clgName=" + clgName + ", getName()=" + getName() + ", getAadhaar()="
				+ getAadhaar() + ", getPhNo()=" + getPhNo() + ", getCity()=" + getCity() + ", getAddr()=" + getAddr()
				+ "]";
	}


	
	
}
