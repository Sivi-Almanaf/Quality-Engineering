package android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class scrolling extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))")).click();



    }
}
