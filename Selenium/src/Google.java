import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java");
		WebElement button = driver.findElement(By.name("btnK"));
		Thread.sleep(2000);
		button.click();
		WebElement research = driver.findElement(By.name("q"));
		research.clear();
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(1000);
		driver.navigate().back();
	}
}
