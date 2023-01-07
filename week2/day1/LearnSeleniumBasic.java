package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSeleniumBasic 
{

	public static void main(String[] args) 
{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kanni");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("revathi");
		
		WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option=new Select(tool);
		option.selectByVisibleText("Employee");
		
		WebElement tool2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option2=new Select(tool2);
		option2.selectByValue("9001");
		
		WebElement tool3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select option3=new Select(tool3);
		option3.selectByIndex(4);
		
		WebElement tool4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select option4=new Select(tool4);
		option4.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		String resultpage=driver.getTitle();
		System.out.println(resultpage);
		
		
		
		
		}

}
