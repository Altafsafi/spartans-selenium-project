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
 //1
     By NavigateToLogin = By.id("signinLink");
     WebElement findTheLogin = webDriver.findElement(NavigateToLogin);
        findTheLogin.click();
//2
       By Email = By.id("email");
       WebElement Emailbox = webDriver.findElement(Email);
       Emailbox.sendKeys("lordaltaf@gmail.com");
//3
      By Password = By.id("password");
      WebElement Enterpassword = webDriver.findElement(Password);
      Enterpassword.sendKeys("Kabul123");
//4
     By Login = By.id("loginBtn");
     WebElement Click = webDriver.findElement(Login);
     Click.click();




    }
}
