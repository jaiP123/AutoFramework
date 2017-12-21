import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testLogin(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.testfire.net");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		driver.findElement(By.id("passw")).submit();
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://demo.testfire.net/bank/main.aspx","User login failed");
	}
}
