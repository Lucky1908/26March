import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.simplilearn.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		  
		
		
	}

}
