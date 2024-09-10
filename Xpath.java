package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Leads']"));
		driver.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jayaprakash");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("JP");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("Cognizant");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

}
