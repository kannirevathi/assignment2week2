package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead2 
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kanni");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("revathi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kannirevathi");
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hai hello this is my automation testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathipandiyan1995@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String result=driver.getTitle();
		System.out.println(result);
		driver.findElement(By.linkText("Duplicate Lead"));
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("newtestleaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("karthick");
		driver.findElement(By.name("submitButton")).click();
		String result1=driver.getTitle();
		System.out.println(result1);
		
	}

}
