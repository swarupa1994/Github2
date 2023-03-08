import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swarupapvs\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("uid")).sendKeys("mngr476232");
		driver.findElement(By.name("password")).sendKeys("syhUmAh");
		driver.findElement(By.name("btnLogin")).click();
		System.out.println(driver.getTitle());
		String expectText=driver.findElement(By.xpath("//td/marquee")).getText();
	    Assert.assertEquals("Welcome To Manager's Page of Guru99 Bank", expectText);
		
		

	}

}
