package com.basicjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Narenderisagoodboy {

	public static void main(String[] args) throws IOException {
		System.out.println("This is a java program");
        System.out.println("we are in a class room");
        FileInputStream excelTestDataFile = new FileInputStream("C:\\Users\\lucky\\Desktop\\1236547.xlsx");

     // Identify the WorkBook in the Excel file
     XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

     // Identify a particular sheet in the WorkBook
     XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

     // Identify a particular Row in the Sheet
     // Row - is an interface in Apache poi
     Row testDataSheet_Row=testDataSheet.getRow(0);

     // Identify a particular Row of a Cell
     Cell testDataSheet_rowOfCell=testDataSheet_Row.getCell(0);

     // get the test data from the Row of a Cell
     String testData=testDataSheet_rowOfCell.getStringCellValue();

     System.out.println(" The test data in the Excel File is :- "+testData);
        

		// TODO Auto-generated method stub

	}

}
