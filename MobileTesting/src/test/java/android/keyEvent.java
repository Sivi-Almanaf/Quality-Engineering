package android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;

public class keyEvent extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();

        System.out.println(driver.currentActivity());
        System.out.println(driver.getContext());
        System.out.println(driver.getOrientation());
        System.out.println(driver.isLocked());

        String package_name = driver.getCapabilities().getCapability(AndroidMobileCapabilityType.APP_PACKAGE).toString();
        System.out.println(package_name);

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();

        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.closeApp();

    }
}
