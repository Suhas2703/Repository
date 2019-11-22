import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanXpathLiving {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		List<WebElement> bedroom = driver.findElements(By.xpath("//span[contains(.,'Bedroom')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
		for (WebElement menu : bedroom) {
			System.out.println(menu.getText());
		}
	}
}
