import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBFillFields {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("DishaPatani");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("TigerShroff");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		
		
		
	}
}
