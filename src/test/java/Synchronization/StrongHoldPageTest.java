package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StrongHoldPageTest {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://fireflyworlds.com/categories/all-games/");
        String Title = webDriver.getTitle();
        System.out.println(Title);

        /// CANT FIND ELEMENTS NEEDS PRACTICE
        WebDriverWait Wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
        WebElement element = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]")));
        element.isDisplayed();
        if(element.isDisplayed()){
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Fail");
        }
        WebDriverWait wait = new WebDriverWait(webDriver,Duration.ofSeconds(3));
        WebElement Element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-9892\"]/div/div[2]/div/a")));
        Element.click();

    }
}
