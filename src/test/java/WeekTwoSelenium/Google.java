package WeekTwoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");

        webDriver.findElement(By.className("gLFyf")).sendKeys("Tek School");
        webDriver.findElement(By.className("gNO89b")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.partialLinkText("TEK SCHOOL Modern")).click();


    }
}
