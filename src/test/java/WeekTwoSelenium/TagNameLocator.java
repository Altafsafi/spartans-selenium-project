package WeekTwoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocator {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://fireflyworlds.com/categories/all-games/");
        // To find the list of links and elements
        //Tag name locator
       By anchorTagLocator = By.tagName("a");
       List<WebElement> anchor = webDriver.findElements(anchorTagLocator);
        System.out.println(anchor.size());
    }
}
