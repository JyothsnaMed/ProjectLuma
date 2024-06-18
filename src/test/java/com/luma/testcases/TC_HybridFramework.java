package com.luma.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.luma.pages.HybridFrameWorks;

public class TC_HybridFramework {

	public static void main (String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HybridFrameWorks hyFW=new HybridFrameWorks(driver);
		
		
		String filePath="C:\\Users\\DELL\\eclipse-workspace\\ProjectLuma\\src\\test\\java\\com\\luma\\testpackage\\LumaData.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet dataSheet=workbook.getSheet("Data");
		XSSFSheet keySheet=workbook.getSheet("Keyword");
		
		int dataRows=dataSheet.getLastRowNum();
		System.out.println("Total No. of Rows: "+dataRows);
		
		int keyRows=keySheet.getLastRowNum();
		System.out.println("Total No. of Rows: "+keyRows);
		
		for(int dr=1;dr<=dataRows;dr++)
		{
			XSSFRow drow=dataSheet.getRow(dr);
			XSSFCell Email=drow.getCell(0);
			XSSFCell Password=drow.getCell(1);
			
			
			try {
			
				for(int kr=1;kr<=keyRows;kr++)
				{
				XSSFRow krow=keySheet.getRow(kr);
				XSSFCell key=krow.getCell(1);
				
				
				switch(key.toString())
				{
				case "openUrl":hyFW.openUrl();
					System.out.println("Keyword is Matched");
					break;
	
				
				case "clickOnSignIn":hyFW.clickOnSignIn();
					System.out.println("Keyword is Matched");
					break;
				
					
				case "enterEmail":hyFW.enterEmail(Email.toString());
					System.out.println("Keyword is Matched");
					break;
			

				case "enterPassword":hyFW.enterPassword(Password.toString());
					System.out.println("Keyword is Matched");
					break;
				
				case "clickOncontinue":hyFW.clickOncontinue();
					System.out.println("Keyword is Matched");
					break;	
				
				}
				System.out.println("Valid Data");
			}
		}
		catch(Exception e) 
		{
			System.out.println("Invalid Data");
		}
		fis.close();
		
		}
	}
}



