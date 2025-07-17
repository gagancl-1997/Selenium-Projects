package Execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ListHandling {
	
	public WebDriver driver;
	
	@BeforeMethod
	public WebDriver driverSetup() {
		EdgeOptions options = new EdgeOptions();
		options.setBrowserVersion("111");
		System.out.println("BrowserVersion ------> "+options.getBrowserVersion());
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return this.driver;
	}
	
	@SuppressWarnings("deprecation")
	@Test(priority = 1, enabled = false)
	public void getListOfElements() {
		driver.get("https://facebook.com/");
		List<WebElement> tagNames = driver.findElements(By.tagName("a"));
		Map<String, String> listOfLinks = new HashMap<String, String>();
		for(WebElement lv : tagNames) {
			if(lv.getText().isEmpty()) {
				
			}else {
				listOfLinks.put("Text - "+lv.getText(), " ID Value - "+lv.getAttribute("href"))
;			//	System.out.println("Text - "+lv.getText()+" ID Value - "+lv.getAttribute("href"));
			}
		}
		System.out.println(listOfLinks);
	}
	

	@Test(priority = 1, enabled = true, dataProvider = "provideData", dataProviderClass = ListHandling.class)
	public void scrolling(String val1, String val2) throws InterruptedException, IOException, AWTException {
		int x =Integer.parseInt(val1);
		int y =Integer.parseInt(val1);
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo("+ x +","+ y +")", "");
		ListHandling.takeScrrenshots(driver);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(null));
		
		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByVisibleText("Automation");
		
		driver.switchTo().alert().sendKeys("");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().frame(1);
		driver.switchTo().window("");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Actions a = new Actions(driver);
		a.moveToElement(null);
		a.contextClick();
		a.dragAndDrop(null, null);
		a.click();
		
	}
	
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
	
	public static void takeScrrenshots(WebDriver driver) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File file = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./screenshot/sample.png"));
	}
	
	@DataProvider(name = "provideData", parallel = true)
	public Object[][] provideData() {
		return new Object [][] {
			{"0", "300"},
			{"0", "-100"}
		};
	}

}
