package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorActivity {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

     By NavigateToLogin = By.id("signinLink");

     WebElement findTheLogin = webDriver.findElement(NavigateToLogin);
        findTheLogin.click();

       By Email = By.id("email");
       WebElement Emailbox = webDriver.findElement(Email);
       Emailbox.sendKeys("lordaltaf@gmail.com");

      By Password = By.id("password");
      WebElement Enterpassword = webDriver.findElement(Password);
      Enterpassword.sendKeys("Kabul123");

     By Login = By.id("loginBtn");
     WebElement Click = webDriver.findElement(Login);
     Click.click();




    }
}
