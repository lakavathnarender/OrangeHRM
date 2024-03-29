package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Identify the file(Excel) in the System
		FileInputStream excelTestDataFile = new FileInputStream("./src/com/singletestdata/sss.xlsx");

		// Identify the WorkBook in the Excel file
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

		// Identify a particular sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Create a Row in the Sheet
		Row newRow=testDataSheet.createRow(4);

		// Create a Row of a Cell in the Row
		Cell newRowOfNewCell=newRow.createCell(3);

		// send the value into the New Row of Cell Created
		newRowOfNewCell.setCellValue("Selenium");

		// save the Excel File on to the System - with the name of file along the extension of the file
		FileOutputStream testOutPutFile = new FileOutputStream("./src/com/singletestdata/sss.xlsx");
		workBook.write(testOutPutFile);

		}

		}


		

	
