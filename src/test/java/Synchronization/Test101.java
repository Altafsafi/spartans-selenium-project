package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test101 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://fireflyworlds.com/categories/all-games/");
        String Title = webDriver.getTitle();
        System.out.println(Title);

        //Synchronization in selenium web driver
        //Refers to managing the timing of interaction with web elements to ensure that tests run reliably
        //and as Expected.

        // Implicit wait
        // Implicit,Wait is a Setting that tells selenium web driver to pull the DOM for a certain amount of time
        // When trying to find an element or elements if they are not immediately available
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Explicit wait
        // Explicit,Wait is used to halt the execution until a certain condition is met or the maximum timeout is
        //Exceeded

        WebDriverWait wait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("")));
        element.click();

        WebDriverWait Wait = new WebDriverWait(webDriver,Duration.ofSeconds(20));
        WebElement Element = Wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
        Element.click();







    }
}
