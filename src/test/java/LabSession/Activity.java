package LabSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");




       By getsignIn = By.id("signinLink");
        WebElement signin = webDriver.findElement(getsignIn);
        signin.click();

        By CreateAC = By.id("newAccountBtn");
        WebElement CreatAccount = webDriver.findElement(CreateAC);
        CreatAccount.click();

        By WriteName = By.id("nameInput");
        WebElement Writename = webDriver.findElement(WriteName);
        Writename.sendKeys("Altaf");

        String EmailPrefix ="franzkafka";
        int number = (int) (Math.random() * 100);
        String randomEmail = EmailPrefix + number +"@gmail.com";

        By Email = By.id("emailInput");
        WebElement emailIN = webDriver.findElement(Email);
        emailIN.sendKeys(randomEmail);

        By password = By.id("passwordInput");
        WebElement Password = webDriver.findElement(password);
        Password.sendKeys("Kabul123@");

        By ConfirmPass = By.id("confirmPasswordInput");
        WebElement confirmPass = webDriver.findElement(ConfirmPass);
        confirmPass.sendKeys("Kabul123@");

        By signup = By.id("signupBtn");
        WebElement Signup = webDriver.findElement(signup);
        Signup.click();

        Thread.sleep(1000);

        By profilePic = By.id("profileImage");
        WebElement ProfilePic = webDriver.findElement(profilePic);
        if(ProfilePic.isDisplayed()){
            System.out.println(" test Pass");
        }else {
            System.out.println(" test not Pass");
        }

        webDriver.quit();

        }


    }

