package steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import ios.base;

public class steps extends base {
    IOSDriver driver;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^user berada pada halaman Login$")
    public void user_berada_pada_halaman_Login() throws Throwable {

        driver = CapabilitiesIOS();


    }

    @When("^user mengklik button Sign In$")
    public void user_mengklik_button_Sign_In() throws Throwable {
        driver.findElement(MobileBy.AccessibilityId("SIGN IN")).click();
    }

    @When("^user mengisi email or Phone number \"([^\"]*)\"$")
    public void user_mengisi_email_or_Phone_number(String noHp) throws Throwable {

        driver.findElementByXPath("//XCUIElementTypeTextField[@value=\"Email atau No Handphone\"]").sendKeys(noHp);


    }

    @When("^user mengisi password \"([^\"]*)\"$")
    public void user_mengisi_password(String password) throws Throwable {
        driver.findElementByXPath("//XCUIElementTypeSecureTextField[@value=\"Password\"]").sendKeys(password);

    }

    @When("^user mengklik kolom button Sign In$")
    public void user_mengklik_kolom_button_Sign_In() throws Throwable {
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();

    }

    @Then("^direct to halaman depan aplikasi sepulsa$")
    public void direct_to_halaman_depan_aplikasi_sepulsa() throws Throwable {
        driver.findElement(MobileBy.AccessibilityId("home-telkom")).isDisplayed();
        takeStepSnapshot(scenario, driver);


    }



}


