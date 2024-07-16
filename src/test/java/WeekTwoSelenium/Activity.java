package WeekTwoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.bbc.com/");

       By Buttons = By.tagName("button");
       List<WebElement> button = webDriver.findElements(Buttons);
        System.out.println(button.size());

    }
}
