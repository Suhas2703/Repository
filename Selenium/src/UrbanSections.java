import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class UrbanSections {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		WebElement dining = driver.findElement(By.xpath("//li[@class='topnav_item diningunit']/span"));
		System.out.println(dining.getText());
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys(dining.getText());
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for (WebElement name : menu) {
			System.out.println(name.getText());
		}
	}
}
