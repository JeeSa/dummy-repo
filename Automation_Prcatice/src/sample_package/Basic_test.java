package sample_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		String SiteURL= "https://sqlzoo.net/wiki/SQL_Tutorial";
		
		//driver path set
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		//Launch driver
		driver = new ChromeDriver();
		//Go to URL
		driver.get(SiteURL);
				
	}

}
