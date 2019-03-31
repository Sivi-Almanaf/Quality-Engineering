package android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.net.MalformedURLException;
import java.time.Duration;

public class gesture extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Expandable Lists\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"1. Custom Adapter\")")).click();
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().description(\"People Names\")")).click();
        TouchAction t = new TouchAction(driver);
        AndroidElement element1 = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"People Names\")"));

//        t.longPress(element1, Duration.ofSeconds(2)).release().perform();
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element1))).release().perform();

        System.out.println(driver.findElement(MobileBy.id("android:id/title")).isDisplayed());




    }
}
