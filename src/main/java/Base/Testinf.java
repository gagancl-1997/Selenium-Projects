package Base;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testinf {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("filename.jpeg"));
		
	}

}
