package com.WebTable;

import org.openqa.selenium.WebElement;

public class WebTable_CapturingFirstColumnData_CityNamesextendsBaseTest {
	public void capturingFirstColumnData_CityNames()
	{
	System.out.println(" Getting the First Column Data ");

	// First Row of First Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]

	// Last Row of the First Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]

	String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpressionPart2="]/td[1]";



	for(int index=1;index<=36;index++)
	{
	// By cityNameProperty=
	//By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");

	// OR
	By cityNameProperty=By.xpath(xpathExpressionPart1+index+xpathExpressionPart2);

	WebElement cityName=driver.findElement(cityNameProperty);
	String cityNameText=cityName.getText();

	System.out.println(cityNameText);
	}

	}

	public static void main(String[] args) {

	WebTable_CapturingFirstColumnData_CityNames webTable = new WebTable_CapturingFirstColumnData_CityNames();

	webTable.applicationLaunch();
	webTable.capturingFirstColumnData_CityNames();
	webTable.applicationClose();


	}


	}



		
	