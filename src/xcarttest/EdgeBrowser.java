package xcarttest;
/*
https://www.x-cart.com/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";//variable declare
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");//copy the path and set the property for browser
        WebDriver driver = new EdgeDriver();//obj created
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.close();
    }
}
