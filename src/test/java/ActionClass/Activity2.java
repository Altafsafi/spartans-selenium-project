package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/selenium/dropdown");

        // Implicit wait
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        // locate element
        WebElement element = webDriver.findElement(By.id("languageSelect"));
        // select drop down element
        Select select = new Select(element);
        select.selectByValue("Italian");


    }
}
