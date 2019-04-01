package android;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class base {

    public static AndroidDriver capabilities() throws MalformedURLException {
        File f = new File("apk");
        File fs = new File(f, "selendroid-test-app-0.11.0.apk");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "BGO-DL09");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");


//        caps.setCapability(MobileCapabilityType.NO_RESET,true);
        caps.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//       caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
//        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ApiDemos");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        return driver;



    }
    public static void takeStepSnapshot(Scenario s, AndroidDriver driver) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        s.embed(screenshot, "image/png");

    }

}
