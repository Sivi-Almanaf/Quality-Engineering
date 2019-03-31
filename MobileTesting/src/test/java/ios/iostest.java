package ios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;


import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class iostest extends baseios{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver driver = CapabilitiesIOS();

//        driver.findElement(MobileBy.AccessibilityId("Alert Views")).click();
//        driver.findElement(MobileBy.xpath("//*[@value='Text Entry']")).click();
//        driver.findElement(MobileBy.className("XCUIElementTypeTextField")).sendKeys("Test123");
//        driver.findElement(MobileBy.name("OK")).click();
//        driver.navigate().back();
//
        driver.navigate().back();
        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth()/2;
        int starty = (int) (size.getHeight() * 0.60);
        int endy =(int) (size.getHeight()*0.10);
//
//        new TouchAction(driver).press(PointOption.point(x, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
////                .moveTo(PointOption.point(x, endy)).release().perform();
//        driver.findElement(MobileBy.AccessibilityId("Steppers")).click();
//
//        driver.navigate().back();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String> scrollObject = new HashMap<>();
//        scrollObject.put("predicateString", "value == 'Switches'");
//        js.executeScript("mobile: scroll", scrollObject);
//        driver.findElement(MobileBy.AccessibilityId("Switches")).click();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String> scrollObject = new HashMap<>();
//        scrollObject.put("predicateString", "value == 'Switches'");
//        scrollObject.put("direction", "up");
//        js.executeScript("mobile: swipe", scrollObject);
//        driver.findElement(MobileBy.AccessibilityId("Switches")).click();
//
//        driver.navigate().back();
//
//        HashMap<String, String> scrollObject2 = new HashMap<>();
//        scrollObject2.put("predicateString", "value == 'Alert Views'");
//        js.executeScript("mobile: scroll", scrollObject2);
//        driver.findElement(MobileBy.AccessibilityId("Alert Views")).click();

        driver.findElement(MobileBy.AccessibilityId("Picker View")).click();
        driver.findElement(MobileBy.AccessibilityId("Green color component value")).sendKeys("220");
        List<IOSElement> elements2 = driver.findElements(MobileBy.className("XCUIElementTypePickerWheel"));
        elements2.get(0).sendKeys("55");
        driver.findElement(MobileBy.xpath("//XCUIElementTypePickerWheel[@name=\"Blue color component value\"]")).sendKeys("130");

//        driver.findElement(MobileBy.AccessibilityId("Picker View")).click();
//        driver.findElement(MobileBy.AccessibilityId("Green color component value")).sendKeys("220");
//        List<IOSElement> elements2=driver.findElements(MobileBy.className("XCUIElementTypePickerWheel"));
//        elements2.get(0).sendKeys("55");
//        driver.findElement(MobileBy.xpath("//XCUIElementTypePickerWheel[@name=\"Blue color component value\"]")).sendKeys("130");







    }
}
