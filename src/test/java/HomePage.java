import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.*;

public class HomePage extends YouTube {

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				".\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		try {
			cssOfId("search").sendKeys(" ");
			cssOfId("search-icon-legacy").click();
			cssOfId("logo-icon-container").click();
			List<WebElement> movieList=driver.findElements(By.id("img"));
			if(cssOfId("img").isDisplayed()) {
				movieList.add(cssOfId("img"));
			}
			cssOfId("search").sendKeys(movieList.toArray().length+" tane video var");
		}
		catch(Exception hata) {
			cssOfId("search").sendKeys(hata.getMessage());
		}
	}
}
