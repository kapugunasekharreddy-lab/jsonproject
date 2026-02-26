package jsonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String filepath=System.getProperty("user.dir");
		
		driver.findElement(By.id("uploadfile")).sendKeys(filepath+"\\Files\\bluescreen.jpg");
		
		Thread.sleep(5000);
	}

}
