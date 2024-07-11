package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekSchoolWebsite {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

       By searchSignIn = By.id("signinLink");
       WebElement findsignIN = webDriver.findElement(searchSignIn);
       findsignIN.click();


    }
}
