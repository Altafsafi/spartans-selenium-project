package CrossBrowsing;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://google.com");
        String Title = firefoxDriver.getTitle();
        System.out.println(Title);



    }
}
