package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();


        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

        // locate the element
      By searchInputLocator = By.id("searchInput");
        // find the element
        WebElement searchInputElement = webDriver.findElement(searchInputLocator);

        // perform the action
        searchInputElement.sendKeys("TV");

        //locate the element

        //find the element

        //perform the action
    }
}
