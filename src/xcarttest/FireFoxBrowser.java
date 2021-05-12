package xcarttest;
/*
https://www.x-cart.com/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.x-cart.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");//property set for browser and copy the path
        WebDriver driver=new FirefoxDriver();//obj created
        driver.manage().window().maximize();//method for maximize window
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();//close the driver for browser
    }
}
