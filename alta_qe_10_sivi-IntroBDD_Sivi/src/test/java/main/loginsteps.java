package main;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class loginsteps {

    @Given("registered account on page https://www.linkedin.com/")
    public void registeredAccount() {
    }

    @When("Input valid email registered, valid password")
    public void validAccount() {

    }
    @When("clik 'Sign In'")
    public void signIn() {
    }

    @Then("Direct to Homepage linkedin")
    public void homepageLogin() {
    }

    @When("Input valid email registered, Invalid password")
    public void validEmailInvalidPassword() {
    }

    @Then("Show Message please enter valid password")
    public void messageValidPasssowrdLogin() {
    }
    @When("Input Invalid email registered, and valid password")
    public void invalidEmailvalidPassword() {
    }

    @Then("Show Message please enter valid email")
    public void messageValidEmailLogin() {
    }
    @When("Input valid email registered, empty password")
    public void validEmailemptyPassword() {
    }

    @Then("Show Message please enter password")
    public void messagePasswordLogin() {
    }
    @When("empty email/phone number and input valid password")
    public void EmptyEmailInputValidPasswordLogin() {
    }

    @Then("Show Message please enter email/phone number")
    public void messageEmailPhoneLogin() {
    }
    @When("Click button 'forgot password'")
    public void forgotPassword() {
    }

    @Then("Direct to page request password reset")
    public void passwordReset() {
    }


}
