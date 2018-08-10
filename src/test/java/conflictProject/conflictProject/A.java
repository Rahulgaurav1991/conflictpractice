package conflictProject.conflictProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class A {
	
	WebDriver driver;
	
	@Test
	public void mouseActions() {

		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[.='Automation Tools']"))).perform();
		List<WebElement> all = driver.findElements(By.xpath("//button[.='Automation Tools']/..//a"));
		for (WebElement name : all) {
			String text = name.getText();
			System.out.println(text);
			System.out.println(name.isEnabled());
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (text.equalsIgnoreCase("Appium")) {
				name.click();
				break;

			}

		}
		driver.quit();
	}

}
