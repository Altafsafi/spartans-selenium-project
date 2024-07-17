package WeekTwoSeleniumDayTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

        webDriver.findElement(By.xpath("//*[@id=\"home\"]")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div[1]/div[1]/div/div/div[2]/img")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[1]/img")).click();
    }
}
