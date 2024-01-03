package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingFirstRowOfFirstCellData_CityNameextendsBaseTest {
	public void capturingFirstRowOfFirstCellData_CityName()
	
	
	{

	/*
	Locator - xpath

	Selector -
	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	    Xpath is of 2 Types

	 1. Relative  - //
	 2. Absolute  - html
	*/

	By cityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
	WebElement cityName=driver.findElement(cityNameProperty);

	String cityNameText=cityName.getText();
	System.out.println(cityNameText);
	
	}

	public static void main(String[] args)
	{

	WebTable_CapturingFirstRowOfFirstCellData_CityName webTable = new WebTable_CapturingFirstRowOfFirstCellData_CityName();

	webTable.applicationLaunch();
	webTable.capturingFirstRowOfFirstCellData_CityName();
	webTable.applicationClose();
	}
	

}
