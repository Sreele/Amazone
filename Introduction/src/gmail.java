import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8289945722");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("lachukaka");
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		//driver.findElement(By.xpath("//input[@name='q']")).submit();
		
	
		
          
	}

}

