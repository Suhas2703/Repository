import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("samarthagowda123@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("password",Keys.ENTER);
		
		
		
	}
}
