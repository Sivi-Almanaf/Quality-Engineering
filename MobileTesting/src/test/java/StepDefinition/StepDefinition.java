package StepDefinition;

import android.base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinition extends base {

    AndroidDriver driver;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^user berada di Main Page$")
    public void user_berada_di_Main_Page() throws Throwable {
        driver = capabilities();

    }

    @When("^user mengklik button Preference$")
    public void user_mengklik_button_Preference() throws Throwable {

        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Preference\")")).click();

    }

    @When("^user mengklik button Preference dependencies$")
    public void user_mengklik_button_Preference_dependencies() throws Throwable {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"3. Preference dependencies\")")).click();

    }

    @When("^user mengklik checkbox Wifi$")
    public void user_mengklik_checkbox_Wifi() throws Throwable {
        String checkbox = driver.findElementById("android:id/checkbox").getAttribute("checked");
        if (!checkbox.contains("true")) {
            driver.findElementById("android:id/checkbox").click();
        }

    }

    @When("^user mengklik button wifi setting$")
    public void user_mengklik_button_wifi_setting() throws Throwable {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();

    }

    @Then("^pop Up Wifi Setting Muncul$")
    public void pop_Up_Wifi_Setting_Muncul() throws Throwable {
        driver.findElement(MobileBy.AndroidUIAutomator(("new UiSelector().resourceId(\"android:id/edittext_container\")"))).isDisplayed();


    }

    @Then("^user mengisi deskripsi Wifi Setting \"([^\"]*)\"$")
    public void user_mengisi_deskripsi_Wifi_Setting_WiFi_ATA_QE_Sce(String deskripsi) throws Throwable {
        driver.findElementById("android:id/edit").sendKeys(deskripsi);
        takeStepSnapshot(scenario, driver);


    }

    @Then("^user mengklik ok$")
    public void user_mengklik_ok() throws Throwable {
        driver.findElementById("android:id/button1").click();

    }

    @After
    public void close_App() {

        driver.closeApp();
    }

    @When("^user mengklik button OS$")
    public void user_mengklik_button_OS() throws Throwable {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"OS\"))")).click();



    }

    @When("^user mengklik button sms messaging$")
    public void user_mengklik_button_sms_messaging() throws Throwable {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"SMS Messaging\")")).click();

    }

    @When("^user mengklik checkbox Enable SMS Broadcast Receiver$")
    public void user_mengklik_checkbox_Enable_SMS_Broadcast_Receiver() throws Throwable {
        String checkbox = driver.findElementById("io.appium.android.apis:id/sms_enable_receiver").getAttribute("checked");
        if (!checkbox.contains("true")) {
            driver.findElementById("io.appium.android.apis:id/sms_enable_receiver").click();

        }
    }
    @When("^user mengisi recipient number \"([^\"]*)\"$")
    public void user_mengisi_recipient_number(String noHP) throws Throwable {
            driver.findElementById("io.appium.android.apis:id/sms_recipient").sendKeys(noHP);
    }

    @When("^user mengisi message body \"([^\"]*)\"$")
    public void user_mengisi_message_body(String smsMsg) throws Throwable {
            driver.findElementById("io.appium.android.apis:id/sms_content").sendKeys(smsMsg);
        }


    @When("^user mengklik tombol SEND$")
    public void user_mengklik_tombol_SEND() throws Throwable {
            driver.findElementById("io.appium.android.apis:id/sms_send_message").click();
        }

    @Then("^munculnotifikasi \"([^\"]*)\"$")
    public void munculnotifikasi(String msgNotif) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,13);
        wait.until(ExpectedConditions.attributeContains(By.id("io.appium.android.apis:id/sms_status"), "text", msgNotif));
        Assert.assertEquals("Pesan Salah", msgNotif, driver.findElementById("io.appium.android.apis:id/sms_status").getText());


    }
}
