package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingImage {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

       By Image = By.id("heroImage");
        WebElement find = webDriver.findElement(Image);

        if (find.isDisplayed()){
            System.out.println(" Test Pass");
        }else {
            System.out.println(" Test Not Pass");
        }

        webDriver.quit();
    }
}
