package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		d.navigate().refresh();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("Demo@1234");
		d.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
