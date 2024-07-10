package Tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {

    public static void main(String[] args) {


        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://dev.insurance.tekschool-students.com/");

       String title = chromeDriver.getTitle();
        System.out.println(title);

        chromeDriver.quit();

    }
}
