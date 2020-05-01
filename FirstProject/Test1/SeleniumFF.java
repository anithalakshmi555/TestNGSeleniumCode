package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.setProperty("webdriver.firefox.marionette","C:\\Program Files\\Selenium\\Driver\\MozillaDriver\\geckodriver.exe");
		System.out.println("2");
		WebDriver driver = new FirefoxDriver();
		System.out.println("3");
			
		//System.setProperty("webdriver.firefox.driver","C:\\Program Files\\Selenium\\Driver\\MozillaDriver\\geckodriver.exe");
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("summer dress");
		driver.findElement(By.name("submit_search")).click();
		String str = driver.getTitle();
		System.out.println("The title of teh website is "+str);
		driver.quit();
		
	}

}
