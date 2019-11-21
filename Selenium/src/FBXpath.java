import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBXpath {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//label[@for='email']"));
		System.out.println(email.getText());
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email.getText());
		WebElement pwd = driver.findElement(By.xpath("//label[@for='pass']"));
		System.out.println(pwd.getText());
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd.getText());
		
	}
}
