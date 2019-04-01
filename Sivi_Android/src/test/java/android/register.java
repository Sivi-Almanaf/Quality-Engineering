package android;


import cucumber.api.Scenario;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

import java.net.MalformedURLException;

public class register extends base {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabilities();

        driver.findElementById("io.selendroid.testapp:id/startUserRegistration").click();
        driver.findElementById("io.selendroid.testapp:id/inputUsername").click();
        driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Sivi Almanaf");
        driver.findElementById("io.selendroid.testapp:id/inputEmail").click();
        driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("sivi@alphatech.id");
        driver.findElementById("io.selendroid.testapp:id/inputPassword").click();
        driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("1234567qwerty");
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mr. Burns\")")).clear();
        driver.findElementById("io.selendroid.testapp:id/inputName").click();
        driver.findElementById("io.selendroid.testapp:id/inputName").sendKeys("Sivi Almanaf");
        driver.hideKeyboard();
        driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Python\")")).click();
        driver.findElementById("io.selendroid.testapp:id/input_adds").getAttribute("checked");
        driver.findElementById("io.selendroid.testapp:id/input_adds").click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Register User (verify)\")")).click();
        System.out.println(driver.findElementById("io.selendroid.testapp:id/tableLayout1").isDisplayed());



    }


}
