package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FacebookActivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.facebook.com/");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        webDriver.findElement(By.partialLinkText("Create new account") ).click();

        webDriver.findElement(By.name("firstname")).sendKeys("Mike");
        webDriver.findElement(By.name("lastname")).sendKeys("Franz");
        webDriver.findElement(By.name("reg_email__")).sendKeys("MikeFranz@gmail.com");
        webDriver.findElement(By.id("password_step_input")).sendKeys("ThisistheEND123@");

       WebElement element = webDriver.findElement(By.id("month"));
        Select month = new Select(element);
        month.selectByValue("9");

        WebElement element1 = webDriver.findElement(By.id("day"));
        Select day = new Select(element1);
        day.selectByValue("22");



    }
}
