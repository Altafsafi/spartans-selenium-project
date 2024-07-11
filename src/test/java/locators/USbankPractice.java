package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class USbankPractice {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.usbank.com/index.html");

       By locateLabel = By.className("label");
       WebElement SearchLabel = webDriver.findElement(locateLabel);
       SearchLabel.click();



    }
}
