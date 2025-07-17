package Execution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Base;
import keywords.KeyWords;

public class Execution extends Base{

	public Base base;
	public WebDriver driver;
	
	public Execution() throws Exception {
		super();
	}
	
	@BeforeClass
	public void launch() throws Exception {
		base = new Base();
		System.out.println(prop.getProperty("browser"));
		this.driver = base.connections(prop.getProperty("browser"));
	}
	
	@Test
	public void test1() throws Exception {
		KeyWords words = new KeyWords();
		System.out.println(this.driver);
		words.launch(this.driver, "https://www.amazon.com/");
	}
 
}
