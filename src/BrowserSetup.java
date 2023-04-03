import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("weddriver.edge.driver", "C:\\DriverMS\\edgedriver_win64");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement daylist = driver.findElement(By.id("day"));
		daylist.click();
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.click();
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(2000);
		month.click();
		daylist.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		WebElement gender=driver.findElement(By.xpath("//input[@id='u_0_5_WP']"));
		gender.click();
		
		driver.quit();
		
		
		
		

	}

}
