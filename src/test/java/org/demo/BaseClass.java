package org.demo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static WebDriver driver;

	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RUBAN\\eclipse-workspace\\POMADACTIN\\Driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void loadurl(String url) {
		driver.get(url);
	}

	public static void fill(WebElement e, String u) {

		e.sendKeys(u);
	}

	public static void click(WebElement e) {

		e.click();
	}
	
	public static void waits()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void screensshots(String screens) throws Throwable {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File Perman = new File("D:\\Selenium\\SeleniumScreen\\Minted.com\\" + screens);
		FileUtils.copyFile(temp, Perman);
	}

	public static void select(WebElement e, String text) {
		Select selec = new Select(e);
		selec.selectByVisibleText(text);
	}
	
	public static String texts(WebElement e)
	{
		  String a = e.getAttribute("value");
		return a;
		 
	}
}
