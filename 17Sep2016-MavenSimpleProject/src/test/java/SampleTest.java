import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testLogin(){
		System.setProperty("webdriver.chrome.driver", "D:\\ClassSelenium\\seleniumJar\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.testfire.net");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		driver.findElement(By.id("passw")).submit();
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://demo.testfire.net/bank/main.jsp","User  Login failed");
		driver.quit();
	}
}
