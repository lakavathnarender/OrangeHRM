package com.DynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingDynamicWebTableextendsBaseTest {
	WebDriver driver;
	public void handlingDynamicWebTable()
	{
		

	// Identifying the WebTable
	// /html/body/div[5]/section[1]/div

	By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
	WebElement webTable=driver.findElement(webTableProperty);

	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	// Identifying the number of Rows in the WebTable
	By webTableRowProperty=By.tagName("tr");
	// In the WebTable finding the number of Row's

	List<WebElement>webTableRows=webTable.findElements(webTableRowProperty);

	int webTableRowsCount=webTableRows.size();

	// should goto every Row - and finding the number of Row of Cell's
	for(int rowIndex=0;rowIndex<=webTableRowsCount;rowIndex++)
	{
	// Going to the WebTable and reaching to a particular Row of the WebTable
	WebElement row=webTableRows.get(rowIndex);

	// Identifying the number of Cells in the Row
	By rowOfCellProperty=By.tagName("td");

	// going to a particular row and identifying the number of Row of Cells
	List<WebElement>rowOfCells=row.findElements(rowOfCellProperty);

	int rowOfCellsCount=rowOfCells.size();

	// going to a Row of all its respective Cells
	for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCellsCount;rowOfCellIndex++)
	{
	// going to a Row of a Cell
	WebElement rowOfCell=rowOfCells.get(rowOfCellIndex);

	// get the data from the Row oF Cell
	String webTableData=rowOfCell.getText();
	System.out.println(webTableData);


	}


	}




	}




	}



