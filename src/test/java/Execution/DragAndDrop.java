package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	public WebDriver driver;
	
	@Test(priority = 1, enabled =  false)
	public void dragdrop() throws InterruptedException {
		
		driver = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement debitsideAcc = driver.findElement(By.xpath("//h3[contains(text(),'Account')]/..//div//ol[1]//li[1]"));
		WebElement creditsideAcc = driver.findElement(By.xpath("//ol[@id='loan']//li"));
		WebElement debitsideAmt = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement creditsideAmt = driver.findElement(By.xpath("//ol[@id='amt8']//li"));
		
		WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']//a"));
		WebElement sales = driver.findElement(By.xpath("//li[@id='credit1']//a"));
		WebElement amount = driver.findElement(By.xpath("//li[@id='fourth']//a"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(amount, debitsideAmt).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(amount, creditsideAmt).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(sales, creditsideAcc).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(bank, debitsideAcc).build().perform();
		Thread.sleep(1000);
		WebElement perfectButton = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		a.moveToElement(perfectButton).build().perform();
		Thread.sleep(2000);
		a.moveToElement(perfectButton).click().build().perform();
		a.contextClick(perfectButton).build().perform();
		
		driver.findElement(By.xpath("")).sendKeys(Keys.ARROW_DOWN);
	  
		
		driver.close();
	}
	
	@Test(priority = 2)
	public void scroll() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://x.com/rundns/alerts");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Search']"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int x = driver.findElement(By.xpath("//span[text()='Search']")).getLocation().getX();
		int y = driver.findElement(By.xpath("//span[text()='Search']")).getLocation().getY();
		new Actions(driver).moveByOffset(x, y).click().build().perform();
		Thread.sleep(7000);
		driver.navigate().to("https://www.guru99.com/software-testing-life-cycle.html");
		Thread.sleep(3000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollTo("+0+","+2000+")");
		driver.close();
	}
  
}
