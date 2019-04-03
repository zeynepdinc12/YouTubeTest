import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
			clickIslemiId("search").sendKeys(" ");
			clickIslemiId("search-icon-legacy").click();
			clickIslemiId("logo-icon-container").click();
			clickIslemiId("search").sendKeys("Hello World!");
			clickIslemiId("search-icon-legacy").click();
			clickIslemiId("video-title").click();
			screenShot("ResultOfSearchBox");
			clickIslemiId("search").sendKeys("Taken ss");
			clickIslemiId("logo-icon-container").click();
			screenShot("LogoControl");
			xPath("//yt-icon[class='style-scope']").click();
		} catch (Exception e) {
			clickIslemiId("search").sendKeys(e.getMessage());
		}
	}

}
