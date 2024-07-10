package Tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();

        // Navigate to Chrome browser
        chromeDriver.get("http://google.com");
        //To maximize the window size
        chromeDriver.manage().window().maximize();

       String title  =   chromeDriver.getTitle();
        System.out.println(title);

        //To close the page
        chromeDriver.quit();




    }
}
