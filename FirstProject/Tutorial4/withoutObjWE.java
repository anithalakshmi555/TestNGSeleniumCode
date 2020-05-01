package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class withoutObjWE {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("Heloo everyone");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\Driver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Heloo everyone");
		driver.get("http://newtours.demoaut.com/mercurysignon.php?");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("selenium");
		driver.findElement(By.name("password")).sendKeys("selenium");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(1000);
		//Booking the flight
		
		WebElement radio_roundtrip = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		radio_roundtrip.click();
		
		Select  webDrpDn = new Select (driver.findElement(By.name("passCount")));
		
		webDrpDn.selectByVisibleText("3");
		
		
		Select  webDrpDn1 = new Select (driver.findElement(By.name("fromPort")));
		
		webDrpDn1.selectByVisibleText("Frankfurt");
				
		
				
		Select  webDrpDn2 = new Select (driver.findElement(By.name("fromMonth")));
		
		webDrpDn2.selectByVisibleText("November");
		
		
		Select  webDrpDn3= new Select (driver.findElement(By.name("toPort")));
		
		webDrpDn3.selectByVisibleText("London");
		
		
		Select  webDrpDn6= new Select (driver.findElement(By.name("toMonth")));
				
		webDrpDn6.selectByVisibleText("November");

		Select  webDrpDn7= new Select (driver.findElement(By.name("toDay")));
				
		webDrpDn7.selectByVisibleText("3");
		
		WebElement radio_economy = driver.findElement(By.xpath("//input[@value='Business']"));
		radio_economy.click();
		
		Thread.sleep(1000);	
		driver.findElement(By.name("findFlights")).click();
		
		Thread.sleep(1000);
		System.out.println("2");
		//Select  webDrpDn8= new Select (driver.findElement(By.name("airline")));
		//webDrpDn8.selectByVisibleText("Blue Skies Airlines");

		WebElement radio_depart = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']"));
        radio_depart.click();
		

		WebElement radio_return = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']"));
        radio_depart.click();
		
		
        driver.findElement(By.name("reserveFlights")).click();
        
        System.out.println("3");
        
        Thread.sleep(1000);
        
        
        driver.findElement(By.name("passFirst0")).sendKeys("Anitha");
        driver.findElement(By.name("passLast0")).sendKeys("Lakshmi");
        driver.findElement(By.name("passFirst1")).sendKeys("Lalitha");
        driver.findElement(By.name("passLast1")).sendKeys("Ramesha");
        
        driver.findElement(By.name("passFirst2")).sendKeys("Nisrga");
        driver.findElement(By.name("passLast2")).sendKeys("Ramesha");
        
        System.out.println("4");
        Select WebDrpDn9 = new Select(driver.findElement(By.name("pass.0.meal")));
        		WebDrpDn9.selectByVisibleText("Vegetarian");;
        		
        		//Vegetarian
        		//Low Calorie
        		//Low Cholesterol
        System.out.println("5");
        Select WebDrpDn10 = new Select(driver.findElement(By.name("pass.1.meal")));
        		WebDrpDn10.selectByVisibleText("Low Calorie");
        
        Select WebDrpDn11 = new Select(driver.findElement(By.name("pass.2.meal")));
        		WebDrpDn11.selectByVisibleText("Low Cholesterol");
        
        Select WebDrpDn12 = new Select(driver.findElement(By.name("creditCard")));
        WebDrpDn12.selectByVisibleText("American Express");
        
        driver.findElement(By.name("creditnumber")).sendKeys("6567 8906 6789 1234");
        
        System.out.println("6");
        Select WebDrpDn13 = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
        WebDrpDn13.selectByVisibleText("2006");
        

        Select WebDrpDn14 = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
        WebDrpDn14.selectByVisibleText("09");
        
        
		//Billing Address
        
        driver.findElement(By.name("billAddress1")).sendKeys("1325 Borregas Ave");
        driver.findElement(By.name("billCity")).sendKeys("Sunnyvale");
        driver.findElement(By.name("billState")).sendKeys("CA");
        driver.findElement(By.name("billZip")).sendKeys("94089");
        

        Select WebDrpDn15 = new Select(driver.findElement(By.name("billCountry")));
        WebDrpDn15.selectByVisibleText("UNITED STATES");
        
        
        driver.findElement(By.name("delAddress1")).sendKeys("1325 Borregas Ave");
        driver.findElement(By.name("delCity")).sendKeys("Sunnyvale");
        driver.findElement(By.name("delState")).sendKeys("CA");
        driver.findElement(By.name("delZip")).sendKeys("94089");


        Select WebDrpDn16 = new Select(driver.findElement(By.name("billCountry")));
        WebDrpDn16.selectByVisibleText("UNITED STATES");
        
        driver.findElement(By.name("buyFlights")).click();
        //log out 
        driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
        
        //driver.findElement("")
		//objWE = driver.findElement(By.name("password")); 
		//objWE.sendKeys("97gmec3010");
		
		//objWE = driver.findElement(By.id("identifierNext")); 
		//objWE.click();
			
		Thread.sleep(1000);
		driver.close();
		driver.quit();
				}
}
