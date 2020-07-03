import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	    //Amazone website automation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//a[@class='nav-action-button']")).click();
		//finding webelement using xpath
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7994515516");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("sujaminu");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
		driver.findElement(By.xpath("//span[contains(text(),'OPPO F11 (Fluorite Purple, 6GB RAM, 128GB Storage)')]")).click();
		// handling multiple windows
		Set<String> s= driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		String base_id=it.next();
		String sub_id=it.next();
		driver.switchTo().window(sub_id);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//button[@id='siAddCoverage-announce']")).click();
		//driver.switchTo().window(base_id);

	}

}
