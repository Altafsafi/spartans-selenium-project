package WeekTwoSeleniumDayTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathStrongHold {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://fireflyworlds.com/categories/all-games/");

        webDriver.findElement( By.xpath("/html/body")).click();
        Thread.sleep(1000);
       By locate = By.xpath("//*[@id=\"post-9892\"]/div/div[2]/div/div/a[2]/div");
        WebElement learnMore = webDriver.findElement(locate);

        learnMore.click();
    }
}
