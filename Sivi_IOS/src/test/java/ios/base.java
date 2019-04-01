package ios;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class base {


    public static IOSDriver CapabilitiesIOS () throws MalformedURLException {
        File f = new File("app");
        File fs = new File(f, "sepulsa-dev.app");

//      Appium Config
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");

        caps.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, "");
        caps.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID, "");

//            caps.setCapability(MobileCapabilityType.NO_RESET,true);
//        caps.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.sepulsa.ios.Sepulsa-Dev");


        IOSDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;
//
//


    }
    public static void takeStepSnapshot(Scenario s, IOSDriver driver) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        s.embed(screenshot, "image/png");

    }
}