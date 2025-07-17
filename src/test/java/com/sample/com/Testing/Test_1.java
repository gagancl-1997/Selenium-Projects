package com.sample.com.Testing;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void takeScreenshot(WebDriver driver, String ssname) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./screenshot/flipkart/" + ssname + ".png"));

	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();

		try {
			takeScreenshot(driver, "homepage");
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<WebElement> tagNames = driver.findElements(By.tagName("a"));
		for (WebElement value : tagNames) {
			if (value.getText().isEmpty()) {

			} else {
				System.out.println(value.getText() + " - " + value.getAttribute("href") + "\n");
			}
		}

	}

}
