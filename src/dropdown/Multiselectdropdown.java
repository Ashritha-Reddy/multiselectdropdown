package dropdown;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/testing1/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		
		Thread.sleep(5000);
	driver.switchTo().frame("iframeResult");
	WebElement e=driver.findElement(By.name("cars"));
	Select s=new Select(e);
	int x=s.getOptions().size();
	System.out.println(x);
	Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		a.click(s.getOptions().get(2)).build().perform();
		a.click(s.getOptions().get(3)).build().perform();
		a.keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(5000);
		s.deselectByIndex(3);
		
	
		
	

int y=s.getAllSelectedOptions().size();
System.out.println(y);
String z=s.getFirstSelectedOption().getText();
System.out.println(z);


	

	driver.close();
	
		
		
		
	}
	
	


	}
