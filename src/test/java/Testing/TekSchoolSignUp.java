package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class TekSchoolSignUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

        By signIn = By.id("signinLink");
        WebElement Signin = webDriver.findElement(signIn);
        Signin.click();

        By NewAccount = By.id("newAccountBtn");
        WebElement New = webDriver.findElement(NewAccount);
        New.click();

        By EnterName = By.id("nameInput");
        WebElement Name = webDriver.findElement(EnterName);
        Name.sendKeys("Mike");

        Random random = new Random();
        String Email1 = "Jhonmisner";
        int randomNumber = random.nextInt(500);
        String RandomEmail = Email1 + randomNumber + "@gmail.com";


        By EnterEmail = By.id("emailInput");
        WebElement Email = webDriver.findElement(EnterEmail);
        Email.sendKeys(RandomEmail);


   By EnterPassword = By.id("passwordInput");
    WebElement Password = webDriver.findElement(EnterPassword);
    Password.sendKeys("Joe@okfo132");

   By RenterPassword = By.id("confirmPasswordInput");
   WebElement Renter = webDriver.findElement(RenterPassword);
   Renter.sendKeys("Joe@okfo132");

  By signUP = By.id("signupBtn");
  WebElement signup = webDriver.findElement(signUP);
  signup.click();

   By profile = By.id("profileImage");
   WebElement profilePic = webDriver.findElement(profile);

    Thread.sleep(3000);

   if(profilePic.isDisplayed()){
       System.out.println(" test pass");
   } else {
       System.out.println(" not passed ");
   }

   webDriver.quit();




    }

}