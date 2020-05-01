package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 

public class myTest {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("Heloo everyone");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\Driver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Heloo everyone");
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
				}

	}
