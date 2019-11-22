import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bluestone.com/");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("Batman");
		driver.findElement(By.name("submitAccount")).click();
	}
}
