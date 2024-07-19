package WeekTwoSeleniumDayTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StrongHoldActivity {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://fireflyworlds.com/categories/all-games/");

        webDriver.findElement(By.xpath("/html/body")).click();
        webDriver.findElement(By.xpath("//*[@id=\"post-9892\"]/div/div[2]/div/div/a[2]/div")).click();

    }
}
