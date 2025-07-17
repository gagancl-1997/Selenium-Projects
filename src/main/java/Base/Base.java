package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;

	public Base() throws IOException {
		prop = new Properties();
		fis = new FileInputStream("./src/main/resources/property.properties");
		prop.load(fis);
	}

	public WebDriver connections(String browser) throws Exception {

		try {
			switch (browser.toLowerCase()) {
			case "chrome":
				driver = new ChromeDriver();
				break;

			case "edge":
				driver = new EdgeDriver();
				break;

			default:
				throw new Exception("Supports only Chrome or Edge Browsers");
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
		return driver;
	}

}
