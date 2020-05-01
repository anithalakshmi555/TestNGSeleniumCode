package com.techbeamers.util;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.techbeamers.page.ChapterFirstPage;
import com.techbeamers.page.ChapterSecondPage;
import com.techbeamers.page.HomePage;

public class TestBase {

	public WebDriver driver;
	public String baseUrl;
	public HomePage homePage;
	public ChapterSecondPage chapterSecond;
	public ChapterFirstPage chapterFirstPage;

	// Method-1.
	
	public void	TestBase() {
		System.out.println(5);
		baseUrl = "http://book.theautomatedtester.co.uk/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Miss Jaydevappa\\Automation\\TestNGSeleniumDemo\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@BeforeSuite
	public void setUp() {
		System.out.println(5);
		baseUrl = "http://book.theautomatedtester.co.uk/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Miss Jaydevappa\\Automation\\TestNGSeleniumDemo\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(6);
		driver.get(baseUrl);
		System.out.println(7);		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// Method-2.
	@AfterSuite
	public void tearDown() throws Exception {
		driver.quit();
	}
		
}

