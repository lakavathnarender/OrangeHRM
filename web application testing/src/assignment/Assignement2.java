package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","WebDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String UrlAddress="https://www.tsrtc.telangana.gov.in/";
		driver.get(UrlAddress);
		
		By headBlockProperty=By.className("menu");
		WebElement HeadBlock=driver.findElement(headBlockProperty);
		
		By HeadBlockLinks=By.tagName("a");
		
		List<WebElement>HeadBlockLink=HeadBlock.
		findElements(HeadBlockLinks);
		int HeadBlockCount=HeadBlockLink.size();
		System.out.println(HeadBlockCount);
		
		for(int index=0;index<HeadBlockCount;index++)
		{
			String Linkname=HeadBlockLink.get(index).getText();
			System.out.println(index+" "+Linkname);
			
			
		}
		}
		
		
		
		
		
		
		
	}


		