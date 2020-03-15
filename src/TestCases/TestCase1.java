package TestCases;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



class TestCase1{
	
	private static WebDriver driver;
	private static ChromeDriverService service;
	
	private Process process; 
	
	public static void createAndStartService() throws IOException {
		service = new ChromeDriverService.Builder()
		      .usingDriverExecutable(new File("chromedriver.exe"))
		      .usingAnyFreePort()
		      .build();
		  service.start();
	}
	
	public static void createDriver() {
		  driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());	  
	}
	
	public static void quitDriver(){driver.quit();
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		createAndStartService();	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {}

	@BeforeEach
	void setUp() throws Exception {
		createDriver();
		driver.manage().window().maximize();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		quitDriver();
	}

	@Test
	void test1() throws InterruptedException {
		driver.get("https://demo.oscommerce.com");
		driver.findElement(By.linkText("Samsung Galaxy Tab")).click();
		driver.findElement(By.id("tdb4")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input[1]")).clear();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input[1]")).sendKeys("2");
		driver.findElement(By.id("tdb4")).click();
		driver.findElement(By.id("tdb5")).click();
		driver.findElement(By.xpath("//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("jocebo6233@mailimail.com");
		driver.findElement(By.xpath("//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("test123");
		Thread.sleep(500);
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.id("tdb6")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[4]/table[6]/tbody/tr")).click();
		Thread.sleep(500);
		driver.findElement(By.id("tdb6")).click();
		Thread.sleep(500);
		driver.findElement(By.id("tdb5")).click();
	}
	
	@Test
	void test2() throws InterruptedException {
		driver.get("https://demo.oscommerce.com");
		driver.findElement(By.linkText("Beloved")).click();
		driver.findElement(By.id("tdb4")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input[1]")).clear();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input[1]")).sendKeys("3");
		driver.findElement(By.id("tdb4")).click();
		Thread.sleep(500);
		driver.findElement(By.id("tdb5")).click();
		driver.findElement(By.xpath("//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("jocebo6233@mailimail.com");
		driver.findElement(By.xpath("//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("test123");
		Thread.sleep(500);
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.id("tdb6")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[4]/table[6]/tbody/tr")).click();
		Thread.sleep(500);
		driver.findElement(By.id("tdb6")).click();
		Thread.sleep(500);
		driver.findElement(By.id("tdb5")).click();
	}

}



