package StepDefinition;

import android.base;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class StepDefinition extends base {
    AndroidDriver driver;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    //
//
    @Given("^user telah menginstall aplikasi$")
    public void user_telah_menginstall_aplikasi() throws Throwable {
        driver = capabilities();

    }

    @When("^user mengklik button folder dokumen$")
    public void user_mengklik_button_folder_dokumen() throws Throwable {
        driver.findElementById("io.selendroid.testapp:id/startUserRegistration").click();

    }

    @When("^user mengklik field username dan input valid username \"([^\"]*)\"$")
    public void user_mengklik_field_username_dan_input_valid_username(String username) throws Throwable {
        driver.findElementById("io.selendroid.testapp:id/inputUsername").click();
        driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys(username);


    }

    @When("^user mengklik field email dan input valid email \"([^\"]*)\"$")
    public void user_mengklik_field_email_dan_input_valid_email(String email) throws Throwable {
        driver.findElementById("io.selendroid.testapp:id/inputEmail").click();
        driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys(email);

    }

    @When("^user mengklik field email password dan input valid password \"([^\"]*)\"$")
    public void user_mengklik_field_email_password_dan_input_valid_password(String password) throws Throwable {
        driver.findElementById("io.selendroid.testapp:id/inputPassword").click();
        driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys(password);;

    }

    @When("^user mengklik field name dan menghapus nama yang tertera$")
    public void user_mengklik_field_name_dan_menghapus_nama_yang_tertera() throws Throwable {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mr. Burns\")")).clear();
        driver.findElementById("io.selendroid.testapp:id/inputName").click();

    }

    @When("^user mengisi field name dengan valid nama \"([^\"]*)\"$")
    public void user_mengisi_field_name_dengan_valid_nama(String deskripsi) throws Throwable {
        driver.findElementById("io.selendroid.testapp:id/inputName").sendKeys(deskripsi);
        driver.hideKeyboard();
        takeStepSnapshot(scenario, driver);

    }

    @When("^user mengklik bahasa pemograman dan pilih python$")
    public void user_mengklik_bahasa_pemograman_dan_pilih_python() throws Throwable {
        driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Python\")")).click();

    }

    @When("^user mengklik box button sampai checklist$")
    public void user_mengklik_box_button_sampai_checklist() throws Throwable {
        driver.findElementById("io.selendroid.testapp:id/input_adds").getAttribute("checked");
        driver.findElementById("io.selendroid.testapp:id/input_adds").click();
        takeStepSnapshot(scenario, driver);

    }

    @When("^user mengklik button register user$")
    public void user_mengklik_button_register_user() throws Throwable {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Register User (verify)\")")).click();

    }

    @Then("^direct to halaman verify user$")
    public void direct_to_halaman_verify_user() throws Throwable {
        System.out.println(driver.findElementById("io.selendroid.testapp:id/tableLayout1").isDisplayed());
//

    }

    @Then("^verifikasi setiap input dengan interface halaman verify user nama \"([^\"]*)\" username \"([^\"]*)\" Password \"([^\"]*)\" Email \"([^\"]*)\" progammingLanguage \"([^\"]*)\" validasi \"([^\"]*)\"$")
    public void verifikasi_setiap_input_dengan_interface_halaman_verify_user_nama_username_Password_Email_progammingLanguage_validasi(String nama, String username, String Password, String Email, String progammingLanguage, String validasi) throws Throwable {
        Assert.assertEquals("Nama Salah", nama, driver.findElementById("io.selendroid.testapp:id/label_name_data").getText());
        Assert.assertEquals("Username Salah", username, driver.findElementById("io.selendroid.testapp:id/label_username_data").getText());
        Assert.assertEquals("Password Salah", Password, driver.findElementById("io.selendroid.testapp:id/label_password_data").getText());
        Assert.assertEquals("Email Salah", Email, driver.findElementById("io.selendroid.testapp:id/label_email_data").getText());
        Assert.assertEquals("Bahasa Pemograman Salah", progammingLanguage, driver.findElementById("io.selendroid.testapp:id/label_preferedProgrammingLanguage_data").getText());
        Assert.assertEquals("false", validasi, driver.findElementById("io.selendroid.testapp:id/label_acceptAdds_data").getText());
        takeStepSnapshot(scenario, driver);
        driver.closeApp();

    }
}
