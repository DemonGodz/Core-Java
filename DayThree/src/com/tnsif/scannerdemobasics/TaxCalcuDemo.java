package com.tnsif.scannerdemobasics;

public class TaxCalcuDemo {
		
	public void CalculateTax(Person person) // directly the object of class person is declare in this method brackets() 
											//so that this method can access the variable and method.
	{
		if ( person.getAge()>65 ||  person.getGender().equalsIgnoreCase("female") )
		{
			person.setTax(0);
			System.out.println("Tax Not Applicable");
		}
		else if (  person.getIncome() <= 160000  ) 
		{
			person.setTax(0);
			System.out.println("For Male Tax Not Applicable");
		}
		else if ( person.getIncome() > 160000 && person.getIncome() <= 500000)
		{
			person.setTax((person.getIncome()-160000)*10/100);
		}
		else if ( person.getIncome() > 500000 && person.getIncome() <= 800000)
		{
			person.setTax((person.getIncome()-500000)*20/100 + 34000);
		}
		else
		{
			person.setTax((person.getIncome()-800000)*50/100 + 94000);
		}
	}
}
