package ActionClass;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptAlertHandling {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        webDriver.findElement(By.id("promptBtn")).click();

        Alert alert = webDriver.switchTo().alert();
        alert.sendKeys("Hey Altaf");
        alert.accept();

    }
}
