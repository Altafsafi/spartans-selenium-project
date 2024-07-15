package Testing101;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://fireflyworlds.com/games/stronghold/");
        String title = webDriver.getTitle();
        System.out.println(title);



    }
}
