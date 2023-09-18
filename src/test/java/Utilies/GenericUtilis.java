package Utilies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtilis {
	WebDriver driver;
	
	public GenericUtilis(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void WindowToChild()
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
	}

}
