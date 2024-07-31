package TestScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScriptTest {

	@Test
	public void run()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
	}
}
