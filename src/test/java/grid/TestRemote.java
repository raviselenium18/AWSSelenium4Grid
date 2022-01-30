package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestRemote {

	@Test
	public void googleTest() throws MalformedURLException, InterruptedException {
		FirefoxOptions opt = new FirefoxOptions();

		WebDriver driver = new RemoteWebDriver(new URL("http://13.127.248.106:4444/"),opt);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Grid!!!");
		System.out.println("Google");
		System.out.println("Hello AWS");
		driver.quit();
	}
}
