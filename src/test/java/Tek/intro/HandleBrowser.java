package Tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        ChromeDriver chromeDriver1 = new ChromeDriver();

        chromeDriver.get("http://google.com");
        chromeDriver1.get("http://facebook.com");



    }
}
