package android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.net.MalformedURLException;

public class dragDrop extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Drag and Drop\")")).click();

        TouchAction t = new TouchAction(driver);
        AndroidElement element1 = (AndroidElement) driver.findElementById("io.appium.android.apis:id/drag_dot_1");
        AndroidElement element2 = (AndroidElement) driver.findElementById("io.appium.android.apis:id/drag_dot_2");

//        t.longPress(element1).moveTo(element2).release().perform();
        t.longPress(LongPressOptions.longPressOptions().longPressOptions().withElement(ElementOption.element(element1))).moveTo(ElementOption.element(element2)).release().perform();



    }
}
