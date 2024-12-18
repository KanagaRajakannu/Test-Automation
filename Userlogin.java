package login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Userlogin {

	public static void main(String[] args) {

		ValidLogin();
		InvalidLogin();

	}

	public static void ValidLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		new WebDriverWait(driver, Duration.ofSeconds(50));
		System.out.println("Testing with valid credentials...");
		driver.get("https://demoqa.com/login");
		driver.findElement(By.id("userName")).sendKeys("KanagaRajakannu"); // Replace with valid username
		driver.findElement(By.id("password")).sendKeys("Test@1234"); // Replace with valid password
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement name = driver.findElement(By.xpath("//label[@id='userName-value']"));
		String username = name.getText();
		if (username.contains("KanagaRajakannu")) {
			System.out.println("Valid login successful! Redirected to profile page.");
		} else {
			System.out.println("Valid login failed.");
		}
		driver.quit();

	}

	public static void InvalidLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println("Testing with invalid credentials...");
		driver.get("https://demoqa.com/login");
		new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.id("userName")).sendKeys("InvalidUser");
		driver.findElement(By.id("password")).sendKeys("WrongPass");
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement errorMessage = driver.findElement(By.xpath("//p[@id='name']"));
		String message = errorMessage.getText();
		if (message.contains("Invalid username or password!")) {
			System.out.println("Invalid login error message displayed correctly.");
		} else {
			System.out.println("Invalid login test failed.");
		}

		driver.quit();

	}
}
