package android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.net.MalformedURLException;

public class swipe extends base  {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Date Widgets\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"2. Inline\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().description(\"9\")")).click();

        TouchAction t = new TouchAction(driver);
        AndroidElement element1 = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().description(\"15\")"));
        AndroidElement element2 = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().description(\"0\")"));

        t.longPress(element1).moveTo(element2).release().perform();
        t.longPress(LongPressOptions.longPressOptions().longPressOptions().withElement(ElementOption.element(element1))).moveTo(ElementOption.element(element2)).release().perform();




    }
}
