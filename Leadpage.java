package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leadpage {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaprakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Purushothaman");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Attur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Salem");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("636121");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if(title.contains("View Lead"))
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("not verified");
		}
		}
	

}

