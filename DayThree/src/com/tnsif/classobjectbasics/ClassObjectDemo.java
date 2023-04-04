package com.tnsif.classobjectbasics;

public class ClassObjectDemo {

	private	int rollNo;
	private	long userId;
	private	String nameInfo;
	private	String addr;
	
	
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public String getNameInfo() {
			return nameInfo;
		}
		public void setNameInfo(String nameInfo) {
			this.nameInfo = nameInfo;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		@Override
		public String toString() {
			return "ClassObjectDemo [rollNo=" + rollNo + ", userId=" + userId + ", nameInfo=" + nameInfo + ", addr="
					+ addr + "]";
		}
		
		
	
	
}
