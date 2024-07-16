package WeekTwoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Locators01 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

        By signIn = By.id("signinLink");
        WebElement Sign = webDriver.findElement(signIn);
        Sign.click();

       By NewAc = By.id("newAccountBtn");
       WebElement NewAccount = webDriver.findElement(NewAc);
       NewAccount.click();

      By enterName = By.name("name");
      WebElement EnterN = webDriver.findElement(enterName);
      EnterN.sendKeys("Mike");

        Random random = new Random();
        int x = random.nextInt(500);
        String Email1 = "Mikefranz";
        String RandomEmail = Email1 + x + "@gmail.com";

     By enterEmail = By.name("email");
     WebElement Email = webDriver.findElement(enterEmail);
     Email.sendKeys(RandomEmail);

        By Password = By.name("password");
        WebElement Pass = webDriver.findElement(Password);
        Pass.sendKeys("kabulAfg321@");

        By RePass = By.name("confirmPassword");
        WebElement Repasss = webDriver.findElement(RePass);
        Repasss.sendKeys("kabulAfg321@");

       By SignIn = By.className("signup__btn");
       WebElement SignUP = webDriver.findElement(SignIn);
       SignUP.click();




    }
}
