package ios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

public class login extends base{
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver = CapabilitiesIOS();

        driver.findElement(MobileBy.AccessibilityId("SIGN IN")).click();
        driver.findElementByXPath("//XCUIElementTypeTextField[@value=\"Email atau No Handphone\"]").sendKeys("085790357741");
        driver.findElementByXPath("//XCUIElementTypeSecureTextField[@value=\"Password\"]").sendKeys("12345qwerty");
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();
        driver.findElement(MobileBy.AccessibilityId("home-telkom")).isDisplayed();



        driver.closeApp();



    }


    }
