package LabSessionWeek02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Activity01 {
    private static Object TimeUnit;

    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

        webDriver.findElement(By.id("signinLink")).click();


        webDriver.findElement(By.name("email")).sendKeys("lordaltaf@gmail.com");
        webDriver.findElement(By.id("password")).sendKeys("Kabul123@");
        webDriver.findElement(By.id("loginBtn")).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        webDriver.findElement(By.className("top-nav__btn")).click();

        Random random = new Random();
        int Random = random.nextInt();



        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        webDriver.findElement(By.name("phoneNumber")).sendKeys(String.valueOf(Random));
        webDriver.findElement(By.id("personalUpdateBtn")).click();


    }
}
