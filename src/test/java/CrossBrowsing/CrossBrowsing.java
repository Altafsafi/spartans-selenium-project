package CrossBrowsing;

import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowsing {
    public static void main(String[] args) {

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");

        String Title = edgeDriver.getTitle();
        System.out.println(Title);

        edgeDriver.quit();

    }
}
