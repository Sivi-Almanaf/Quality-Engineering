import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Webdriver {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","/usr/local/Caskroom/chromedriver/73.0.3683.68/chromedriver");

        Webdriver driverChrome = new ChromeDriver();

        driverChrome.navigate().to("http://www.amazon.com");

        ((ChromeDriver) driverChrome).manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        ((ChromeDriver) driverChrome).findElement(By.cssSelector(""));

        ((ChromeDriver) driverChrome).getCurrentUrl();
        ((ChromeDriver) driverChrome).manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        if(((ChromeDriver) driverChrome).getCurrentUrl().contains("_encoding")){

        }

        ((ChromeDriver) driverChrome).close();
        ((ChromeDriver) driverChrome).quit();
    }
}
