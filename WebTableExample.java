import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		//Total number of Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		System.out.println("Total no of Rows are" + rows.size());
		
		//Total number of columns
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Total number of columns" + columns.size());
		
		//3rdRow and 1 column data
		
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println("The data is " + data.getText());
		
		for(int i=2;i<=rows.size();i++) {
			
			List<WebElement> columnsData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+ i + "]/td"));
			System.out.println(columnsData.get(0).getText()+" "+ columnsData.get(1).getText()+" "+columnsData.get(2).getText());
		}
		

	}

}
