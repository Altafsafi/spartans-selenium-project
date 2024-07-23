package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleDropDownWithOutSelect {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/selenium/dynamic-select");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/div/input"))
                .click();




    }
}
