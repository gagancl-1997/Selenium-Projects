package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.Base;

public class Screenshots extends Base{

	public Screenshots() throws IOException {
		super();
	}

	public void takeScreenshot(WebDriver driver) throws IOException {
		String fileSuffix = new SimpleDateFormat("yyyy-dd-M--HH-mm-ss").format(new Date());
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(prop.getProperty("screenshotPath")+fileSuffix+"/"+fileSuffix+".png"));
	}

}
