import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.simplilearn.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		  
		  System.out.println("The title of the page is"+ driver.getTitle());
		  
		  WebElement loginLink = driver.findElement(By.linkText("Log in"));
		 String location = loginLink.getAttribute("href");
		 System.out.println("The link will take you to"+ location);
		 loginLink.click();
		 
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("lakshitgurtatta@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("passworD@123");
		
		WebElement rememberChkBx = driver.findElement(By.className("rememberMe"));
		rememberChkBx.click();
		
		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();	
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		System.out.println("The error is" + errorMsg);
		String expErrorMsg = "The email or password you have entered is invalid.";
		
		if(error.isDisplayed()&& errorMsg.equals(expErrorMsg)) {
			System.out.println("TC is passed");
		}
		else {
			System.out.println("TC failed");
		}
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No. Of links" +links.size());
		
		for(WebElement link:links) {
		
			System.out.println(link.getAttribute("href"));
		
	}
		driver.quit();
	}
}

