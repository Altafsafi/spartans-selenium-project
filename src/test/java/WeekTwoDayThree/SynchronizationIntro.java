package WeekTwoDayThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SynchronizationIntro {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

        //Applying Implicit Wait
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Applying Explicit Wait
        WebDriverWait wait = new WebDriverWait(webDriver,Duration.ofSeconds(10));

       WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        input.sendKeys("WrongInput@gmail.com");


    }
}
