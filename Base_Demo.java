package BaseClassProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Demo {
	static WebDriver driver;
	
	public static void BrowserLaunch() {
       driver=new ChromeDriver();
	}
	
	public static void Url(String s) {
		driver.get(s);
    
	}
	public static void SendKeys(WebElement a ,String s) {
		a.sendKeys(s);
       
	}
	public static void Click(WebElement b) {
		b.click();
	}
	
	public static void Quit() {
      
	}
	
	private static void Selectby_Index(WebElement d,int i) {
       Select s1=new Select(d);
       s1.selectByIndex(i);
	}
	
	public static void Selectby_value(WebElement e,String j) {
		Select s2=new Select(e);
	       s2.selectByValue(j);
	}
	
	public static void Selectby_visisbleText(WebElement f,String k) {
		Select s3=new Select(f);
		s3.selectByVisibleText(k);
	}
	
	public static void Screenshot(String ss) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;//driver class variable
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\amazon\\"+ss+".png");
        FileUtils.copyFile(screenshotAs, f);		
	}
	
	public static void Action() {
		Actions ac=new Actions(driver);
		WebElement s = driver.findElement(By.id("angular"));
		ac.build().perform();
	}
	public static void Robot1() throws AWTException {
		Robot r= new Robot();  //AWT is abstract window tool kit
	      r.keyPress(KeyEvent.VK_DOWN);
	       r.keyRelease(KeyEvent.VK_DOWN);
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	private static void Alert1() {
		 Alert alert = driver.switchTo().alert();
	     alert.accept();
	}
	
	public static void ImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	public static void main(String[] args) throws IOException, AWTException {
		Url("Google");
		SendKeys(driver.findElement(By.id(" ")),"kams");
		Click(driver.findElement(By.id(" ")));
		driver.quit();
		Selectby_Index(driver.findElement(By.id(" ")),5);
		Selectby_value(driver.findElement(By.id(" ")),"abc");
		Selectby_visisbleText(driver.findElement(By.id(" ")),"abc");
		Screenshot("google");
		Action();
		Robot1();
		Alert1();
		ImplicitWait();
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	

}
