package com.techbeamers.page;
import com.techbeamers.page.ChapterFirstPage;
import com.techbeamers.page.ChapterSecondPage;
import com.techbeamers.page.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.techbeamers.page.HomePage;
import com.techbeamers.util.TestBase;

public class MyTest extends TestBase {

	// Test-0.
/*	@Test*/
	MyTest(){
		super();
		System.out.println(1);
	}
	
	public void testPageObject() throws Exception {

		try {
		//homePage  = PageFactory.initElements(driver, HomePage.class);
		
		HomePage hp = new HomePage(driver);
		ChapterSecondPage chapterSecond;
		//driver.get(baseUrl);
		System.out.println(8);
		chapterSecond = hp.clickChapterSecond();
		System.out.println(9);
		chapterSecond.clickbut2();
		chapterSecond.clickRandom();
		String data = chapterSecond.getTest();
		homePage = chapterSecond.clickIndex();

		chapterFirstPage = homePage.clickChapterFirst();
		chapterFirstPage.clickSecondAjaxButton();
		chapterFirstPage.clickSecondAjaxButton1(data);
		chapterFirstPage.selectDropDown("Selenium Core");
		chapterFirstPage.verifyButton();
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
		}
	}

public static void main(String args[]) {
	MyTest t = new MyTest();
	
	try {
		System.out.println(2);
		t.setUp();
		t.testPageObject();
		System.out.println(3);
	}
	catch(Exception e)
	{
		System.out.println("I am in main method Exception "+e);
	}
	}
}

