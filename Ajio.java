package homeAssignment.week3_2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) { 
		ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.ajio.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(5));

	}

}
