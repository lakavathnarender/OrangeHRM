package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {
	public static void main(String[] args) throws IOException {
		// Identify the file(Excel) in the System
		FileInputStream excelTestDataFile = new FileInputStream("./src/com/singletestdata/SingleTestDast.xlsx");

		// Identify the WorkBook in the Excel file
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

		// Identify a particular sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("SingleTestData");

		// Identify a particular Row in the Sheet
		// Row - is an interface in Apache poi
		Row testDataSheet_Row=testDataSheet.getRow(0);

		// Identify a particular Row of a Cell
		Cell testDataSheet_rowOfCell=testDataSheet_Row.getCell(0);

		// get the test data from the Row of a Cell
		String testData=testDataSheet_rowOfCell.getStringCellValue();

		System.out.println(" The test data in the Excel File is :- "+testData);


		}

		}

	
	
