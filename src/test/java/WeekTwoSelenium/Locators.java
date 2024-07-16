package WeekTwoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://fireflyworlds.com/categories/all-games/");

       By StrongholdHD = By.className("fill-dive");
       WebElement HD = webDriver.findElement(StrongholdHD);
       HD.click();

      By learnMore =  By.className("homepage-box-button homepage-box-learn-button");
      WebElement LearnM = webDriver.findElement(learnMore);
      LearnM.click();
    }
}
