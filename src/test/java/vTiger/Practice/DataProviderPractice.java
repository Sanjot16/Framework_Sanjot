package vTiger.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider="getData")
	public void sampleTest(String phoneName,int price)
	{
		System.out.println(phoneName+"----->"+price);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="Samsung";
		data[0][1]=25000;
		
		data[1][0]="Oneplus";
		data[1][1]=50000;
		
		data[2][0]="Iphone";
		data[2][1]=100000;
		
		return data;
		
		
	}

}
