import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		/*Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();*/
		driver.navigate().to("https://www.Naukri.com/");
		/*String title= driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(100);
		Set<String> wins = driver.getWindowHandles();
		Thread.sleep(100);
		//wins.remove(parent);
		ArrayList<String> s=new ArrayList<>(wins);
		{
			//s.addAll(wins); INSTEAD OF USING wins IN FORMAL ARGUMENT CAN USE THIS ALSO WHEN USING THIS REMOVE wins FROM ARRAYLIST ARGUMENT
			
			for(int i=s.size()-1;i>=0;i--)
				driver.switchTo().window(s.get(i)).close();
		}
		/*for (String win : wins) {
			System.out.println(win);
			Thread.sleep(100);
			driver.switchTo().window(win).close();
			
		}*/
	}
}
