package com.DynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OsmaniaUniversity_SelectLanguage_SelectionextendsBaseTest {
	WebDriver driver;
	@Test
	public void dropDownSelectLanguageTest()
	{

	// Identifying the Select Language DropDown

	// id="gtranslate_selector"

	By selectLanguagesDropDownProperty=By.id("gtranslate_selector");
	WebElement selectLanguagesDropDown=driver.findElement(selectLanguagesDropDownProperty);

	// <option value="en|hi">Hindi</option>
	// <option value="en|fr">French</option>
	// <option value="en|te">Telugu</option>
	// <option value="en|ur">Urdu</option>
	//<option value="en|ta">Tamil</option>

	By dropDownElementProperty=By.tagName("option");
	List<WebElement>selectLanguages=selectLanguagesDropDown.findElements(dropDownElementProperty);

	int selectLanguagesCount=selectLanguages.size();
	System.out.println(" The number of languages in Select Languages DropDown is :- "+selectLanguagesCount);

	for(int index=0;index<selectLanguagesCount;index++)
	{
	String selectLanguagesDropDownlanguageName=selectLanguages.get(index).getText();
	System.out.println(index+" "+selectLanguagesDropDownlanguageName);
	}

	// selecting an Optional Value from the DropDown(Select Languages)

	Select selectLanguagesSelection = new Select(selectLanguagesDropDown);
	//selectLanguagesSelection.selectByIndex(7);
	//selectLanguagesSelection.selectByValue("en|ur");// string Type
	selectLanguagesSelection.selectByVisibleText("Tamil");// string Type

	// DeSelection of Selected Optional Value from the DropDown
	//   during a selection of an optional value from the dropdown - when going for
     //  deselection of the same selected Optional Value - it is not mandartory to	    //    use a similar type of method
	selectLanguagesSelection.deselectByVisibleText("Telugu");
	selectLanguagesSelection.deselectByValue("en|ta");
	selectLanguagesSelection.deselectByIndex(9);

	// to deselect all the selected Optional values at a time then use the below method
	selectLanguagesSelection.deselectAll();
	}


	}

