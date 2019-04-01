package Test;

import Steps.LoginSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;


public class Login extends SerenityStory {

        @Steps
        LoginSteps loginSteps;

        @Given("I open linkedin login page")
        public void GivenLoginFacebook() {
            loginSteps.OpenFacebookPage();
        }

        @When("I input email and password $email_user dan $password")
        public void WhenInputEmailPassword(String email_user, String password) {
            loginSteps.InputEmail(email_user);
            loginSteps.InputPassword(password);
        }

        @When("I click button sign in")
            public void WhenClickButtonLogin() {
                loginSteps.ClickButtonLogin();
            }
        @Then("I got to my news feed")
        public void ThenLoginSucces(){
           loginSteps.ShouldLoginSuccess();

        }

        @Then("I got to show error message")
        public void ThenLoginFailed(){
            loginSteps.ShouldLoginFail();
        }

    @Then("I got to notification as human")
    public void NotificationHuman(){
        loginSteps.ShouldLoginFailNotification();
    }



    }
