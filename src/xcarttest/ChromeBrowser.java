package xcarttest;
/*
https://www.x-cart.com/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";//variable declare
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//set property for browser and copy path
        WebDriver driver = new ChromeDriver();//obj crated
        driver.manage().window().maximize();//method for maximize window
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);
        //fetch title
        String title= driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
