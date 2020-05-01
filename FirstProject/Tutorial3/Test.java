package Tutorial3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.out.println("1");
		System.out.println("Heloo everyone");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\Driver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Heloo everyone");
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://mywipro.wipro.com");
		Thread.sleep(1000);
		
		driver.navigate().back();//Navigating backwars
		Thread.sleep(1000);
		driver.navigate().forward();//Navigating forward
		Thread.sleep(1000);
		driver.navigate().refresh();//Refreshing the browser
		
		driver.close();
		driver.quit();


	}

}
