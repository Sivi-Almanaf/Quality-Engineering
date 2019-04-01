package ios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;
import java.time.Duration;

public class register extends base {
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver = CapabilitiesIOS();


        driver.findElement(MobileBy.AccessibilityId("REGISTER")).click();



        driver.findElementByXPath("//XCUIElementTypeTextField[@value=\"Nama Lengkap\"]").sendKeys("Silla");
        driver.findElementByXPath("//XCUIElementTypeTextField[@value=\"No Handphone\"]").sendKeys("085821016123");
        driver.findElementByXPath("//XCUIElementTypeTextField[@value=\"Email\"]").sendKeys("adikkqj@gmail.com");
        driver.findElementByXPath("//XCUIElementTypeSecureTextField[@value=\"Password\"]").sendKeys("12345qwerty");
        driver.findElement(MobileBy.AccessibilityId("Toolbar Done Button")).click();
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"sepulsa-dev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton").click();
        driver.findElement(MobileBy.AccessibilityId("Register")).click();
//        driver.findElement(MobileBy.AccessibilityId("Tidak mendapatkan sms OTP?")).isDisplayed();
        driver.findElement(MobileBy.AccessibilityId("sepulsa-dev")).isDisplayed();
        driver.findElementByXPath("//XCUIElementTypeTextField[@value=\"Masukan OTP\"]").sendKeys("123456");
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Konfirmasi No Handphone\"]").click();
        driver.findElement(MobileBy.AccessibilityId("Menu")).click();
        driver.navigate().back();
        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth()/2;
        int starty = (int) (size.getHeight() * 0.60);
        int endy =(int) (size.getHeight()*0.10);
        new TouchAction(driver).press(PointOption.point(x, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
              .moveTo(PointOption.point(x, endy)).release().perform();
        driver.findElement(MobileBy.AccessibilityId("Rate Sepulsa App")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign out")).click();
        driver.findElement(MobileBy.AccessibilityId("Keluar aplikasi?")).isDisplayed();
        driver.findElement(MobileBy.AccessibilityId("Keluar aplikasi?")).click();










    }
}
