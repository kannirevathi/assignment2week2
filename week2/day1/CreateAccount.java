package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
	    driver.findElement(By.name("importantNote")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.id("groupNameLocal")).sendKeys("kannirevathi");
	    driver.findElement(By.id("officeSiteName")).sendKeys("testing team");
        driver.findElement(By.id("annualRevenue")).sendKeys("50,000");
        
        WebElement option = driver.findElement(By.name("industryEnumId"));
        Select tool=new Select(option);
        tool.selectByVisibleText("Computer Software");
        
        WebElement option2 = driver.findElement(By.name("ownershipEnumId"));
	    Select tool2=new Select(option2);
	    tool2.selectByVisibleText("S-Corporation");
	    
	    WebElement option3 = driver.findElement(By.id("dataSourceId"));
	    Select tool3=new Select(option3);
	    tool3.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement option4 = driver.findElement(By.id("marketingCampaignId"));
	    Select tool4=new Select(option4);
	    tool4.selectByIndex(6);
	    
	    WebElement option5 = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select tool5=new Select(option5);
	    tool5.selectByValue("Texas");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	   
	    }

}
