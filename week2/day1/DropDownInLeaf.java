package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInLeaf 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement click = driver.findElement(By.className("ui-selectonemenu"));
		Select option=new Select(click);
		option.selectByVisibleText("Selenium");
		
	    driver.findElement(By.className("ui-selectonemenu-label ui-inputfield ui-corner-all")).click();
		WebElement option2 = driver.findElement(By.className("ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all"));
		option2.selectByVisibleText("India");
		
		
		
		
		
		Select option2=new Select(click2);
	    option2.selectByVisibleText("India");
		
		WebElement click3 = driver.findElement(By.id("j_idt87:city_label")).click();
		Select option3=new Select(click3);
		option3.selectByVisibleText("Chennai");
		
		WebElement click4 = driver.findElement(By.className("ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left"));
		Select option4=new Select(click4);
		option4.selectByValue("Selenium WebDriver");
		
		WebElement click5 = driver.findElement(By.id("j_idt87:lang_label"));
		Select option5=new Select(click5);
		option5.selectByVisibleText("English");
		
		WebElement click6 = driver.findElement(By.id("j_idt87:value_label"));
		Select option6=new Select(click6);
		option6.selectByIndex(3);
		
		}

}
