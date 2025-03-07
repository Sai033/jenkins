package Driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;





public class xpaths {
	 static WebDriver d = DriverUtils.getWebDriver();
	 static WebDriverWait w=new WebDriverWait(d,Duration.ofSeconds(10));
	 public void xpathClick(String xpath,String elementName) {
		
		try {
			WebElement z=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		boolean element=z.isDisplayed();
		if(element) {
			z.click();
		}
		else {
			System.out.println(elementName + "  -----------is Not Displaying");
		}
		}
		catch(Exception e) {
		System.out.println("Exception : "+e);
		}
	 }
        
	public void xpathSendkeys(String xpath,String data,String elementName) {
		try {
			WebElement z=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		boolean element=z.isDisplayed();
		if(element) {
			z.sendKeys(data);;
		}                                         
		else {
			System.out.println(elementName + "  -----------is Not Displaying");
		}
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
			}
	}
public static boolean CheckElementDisplayedbyXpath(String xpath, String elementName) {
	try {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		boolean element = d.findElement(By.xpath(xpath)).isDisplayed();
		if (element) {
			System.out.println(elementName + " is Displaying");
		} else {
			System.out.println(elementName + "  -----------is Not Displaying");
		}
		return true;
	} catch (Exception e) {
		System.out.println("not able  to validate Display element");
		System.out.println("Exception : " + e);
		return false;
	}

}}


