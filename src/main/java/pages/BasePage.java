package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class BasePage {

	public int randomNumberGenerator() {
		Random random = new Random();
		return random.nextInt(1100);
	}

	public int dateNumberGenerator() {
		Random random = new Random();
		return random.nextInt(33);
	}

	public String phoneNumberGenerator() {
		Random random = new Random();
		int areaCode = random.nextInt(1100);
		int firstThree = random.nextInt(1100);
		int lastfour = random.nextInt(11000);
		return areaCode + " " + firstThree + " " + lastfour;
	}

	public void selectFromDropdownByVisibleText(WebElement element, String input) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(input);
	}

	public void selectFromDropdownByValue(WebElement element, String input) {
		Select dropdown = new Select(element);
		dropdown.selectByValue(input);
	}

	public String removeDecimalPoint(String str) {
		return str.substring(0, str.length() - 2);
	}

	public double convertStringToDouble(WebElement element) {
		String stringElement = element.getText().substring(1);
		double doubleElement = Double.parseDouble(stringElement);
		return doubleElement;
	}

	public void waitForElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
