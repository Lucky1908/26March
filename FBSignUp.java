import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		//Create new account
		
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("lakshit");
		
		WebElement ln = driver.findElement(By.xpath("//input[@name='lastname']"));
		ln.sendKeys("arora");
		
		WebElement Mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Mobile.sendKeys("999999999");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("Abc@1234");
		
		WebElement selectedDay = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("the selected day is" + selectedDay.getText());
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select dDay=new Select(day);
		dDay.selectByVisibleText("10");
	
		WebElement mn = driver.findElement(By.xpath("//select[@title='Month']"));
		Select month=new Select(mn);
		month.selectByVisibleText("Aug");
		
		WebElement yr = driver.findElement(By.xpath("//select[@title='Year']"));
		Select year=new Select(yr);
		year.selectByVisibleText("1992");
		
		
		List<WebElement> list = driver.findElements(By.xpath("//select[@title='Month']/option"));
		for(WebElement Months:list) {
		
		System.out.println(Months.getText());
		}
	//	WebElement rBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
	//	rBtn.click();
		
		String Gender = "Custom";
		
		String dummyXpath = "//label[text()='placeholder']";
		
		String newXpath = dummyXpath.replace("placeholder", Gender);
		System.out.println("The new xpath is"+ newXpath);
		
		WebElement genderElement = driver.findElement(By.xpath(newXpath));
		genderElement.click();
		
		//tagname#id 
		//input#email
		
		
		}
		
	}


