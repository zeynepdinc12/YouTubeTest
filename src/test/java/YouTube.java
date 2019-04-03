import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.Date;
import java.util.Random;


public abstract class YouTube {
	Random random=new Random();
	protected WebDriver driver;	
	
	protected WebElement clickIslemiClass(String className)throws Exception {
		return driver.findElement(By.className(className));
	}
	
	protected WebElement clickIslemiId(String id)throws Exception {
		return driver.findElement(By.id(id));
	}
	
	protected WebElement xPath(String path)throws Exception {
		return driver.findElement(By.xpath(path));
	}
	
	protected WebElement idAndClass(String id,String className)throws Exception {
		return driver.findElement(By.id(id).className(className));
	}	
	
	protected WebElement linkText(String text) {
		return driver.findElement(By.linkText(text));
	}
	
	protected void screenShot(String imageName) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/" + imageName + ".png"));
	}

}
