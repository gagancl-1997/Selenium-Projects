package com.sample.com.Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestingPractise {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		// driver class methods
		driver.get("https://practice.expandtesting.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Webpage Title - "+driver.getTitle());
		System.out.println("Webpaage Source- "+ driver.getPageSource().toString());
		System.out.println("Current webpage URL- "+ driver.getCurrentUrl());
		
		driver.quit();
		
	}
	
}
