package xampp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mainClass {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new ChromeDriver();
		
		
		
		
	}

}
