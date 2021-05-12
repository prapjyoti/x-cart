package xcarttest;
/*
https://www.x-cart.com/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";//variable declare (url)
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");//set property for browser and copy the path
        WebDriver driver = new InternetExplorerDriver();//obj created
        driver.manage().window().fullscreen();//method for fullscreen window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//method for time out
        driver.get(baseUrl);//called the method
        driver.close();//close the driver for browser
    }
}
