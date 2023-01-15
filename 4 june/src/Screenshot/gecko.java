package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gecko {

	public static void main(String[] args) {
		System.setProperty("webdriver.Edge.driver", "D:\\edge driv\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
	}

}
