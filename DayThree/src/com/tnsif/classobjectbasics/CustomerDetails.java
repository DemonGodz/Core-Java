package com.tnsif.classobjectbasics;

public class CustomerDetails {

	
		private int customerId;
		private String customerName;
		private String customerCity;
		
		public CustomerDetails(){
			System.out.println("Default Constructor");
			customerId = 191054;
			customerName = "Divakar Gajelli";
			customerCity = "Mumbai";
		}
		
		
		public CustomerDetails(int customerId, String customerName, String customerCity) {
			
			System.out.println("Parametrized Constructor");
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerCity = customerCity;
		}



		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerCity() {
			return customerCity;
		}
		public void setCustomerCity(String customerCity) {
			this.customerCity = customerCity;
		}


		@Override
		public String toString() {
			return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
					+ customerCity + "]";
		}
		
		
		
}
