package com.DynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingCompleteWebTableDataextendsBaseTest {
	WebDriver driver;
	@Test
	public void capturingCompleteWebTableData()
	{
	System.out.println(" Getting the Complete WebTable Data ");

	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]

	String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpressionPart2="]/td[";
	String xpathExpressionPart3="]";

	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	By webTableDataProperty=By.xpath
	(xpathExpressionPart1+rowIndex+xpathExpressionPart2+rowOfCellIndex+xpathExpressionPart3);
	WebElement webTableData=driver.findElement(webTableDataProperty);
	String webTableDataText=webTableData.getText();
	System.out.print(webTableDataText+"  | ");
	}
	System.out.println();
	}

	}



	}


