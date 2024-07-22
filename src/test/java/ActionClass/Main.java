package ActionClass;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/selenium/dropdown");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      WebElement element = webDriver.findElement(By.id("programmingLanguageSelect"));
        // Selecting elements from a dropDown
        Select languageSelect = new Select(element);
        languageSelect.selectByIndex(5);

        WebElement Element = webDriver.findElement(By.id("countrySelect"));
        Select Country = new Select(Element);
        Country.selectByValue("United States");

        WebElement Ele = webDriver.findElement(By.id("languageSelect"));
        Select Lang = new Select(Ele);
        Lang.selectByIndex(2);



    }
}
