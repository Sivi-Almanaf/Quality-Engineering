package android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class basic extends base {

    public static void main(String[] args) throws MalformedURLException {


        AndroidDriver driver = capabilities();

//        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Preference\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"3. Preference dependencies\")")).click();
        String checkbox = driver.findElementById("android:id/checkbox").getAttribute("checked");
        if(!checkbox.contains("true")) {
            driver.findElementById("android:id/checkbox").click();
        }
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
        driver.findElementById("android:id/edit").sendKeys("wifi ATA QE");
        driver.findElementById("android:id/button1").click();

        driver.closeApp();
        driver.launchApp();
    }
}