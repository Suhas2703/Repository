import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLaunch {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 
	    //driver.switchTo().window(tabs.get(1));
	    driver.navigate().to("https://www.testyantra.com/");
		// driver.switchTo().window(tabs.get(2));
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.qspiders.com/");
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.quit();
		}
}
