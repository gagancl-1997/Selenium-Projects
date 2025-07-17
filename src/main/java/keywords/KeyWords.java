package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Utils.Screenshots;

public class KeyWords {
	
	public Screenshots scr; 
	
	public WebDriver launch(WebDriver driver, String url) throws Exception {
		scr = new Screenshots();
		try {
			driver.get(url);
			scr.takeScreenshot(driver);
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

	public WebDriver click(WebDriver driver, By element) throws Exception {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

	public WebDriver clear(WebDriver driver, By element) throws Exception {
		try {
			driver.findElement(element).clear();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

	public WebDriver getText(WebDriver driver, By element) throws Exception {
		try {
			driver.findElement(element).getText();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

	public WebDriver getTagName(WebDriver driver, By element) throws Exception {
		try {
			driver.findElement(element).getTagName();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

	public WebDriver KeyIn(WebDriver driver, By element, String data) throws Exception {
		try {
			driver.findElement(element).sendKeys(data);
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

	public WebDriver doubleClick(WebDriver driver, By element) throws Exception {
		try {
			Actions a = new Actions(driver);
			a.doubleClick(driver.findElement(element)).build().perform();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

	public WebDriver moveToElement(WebDriver driver, By element) throws Exception {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(element)).build().perform();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

	public WebDriver moveToElementAndClick(WebDriver driver, By element) throws Exception {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(element)).build().perform();
			a.click();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

}
