package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		WebElement objWE;
		objWE = driver.findElement(By.id("identifierId")); 
		objWE.sendKeys("anithalakshmij@gmail.com");
		

		objWE = driver.findElement(By.id("identifierNext")); 
		objWE.click();
		

		objWE = driver.findElement(By.id("identifierNext")); 
		objWE.click();
		
		objWE = driver.findElement(By.name("password")); 
		objWE.sendKeys("97gmec3010");
		
		objWE = driver.findElement(By.id("identifierNext")); 
		objWE.click();
		
		
		Thread.sleep(1000);
		driver.close();
				}

	}
