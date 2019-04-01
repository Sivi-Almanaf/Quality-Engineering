package test.Login;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Login extends SerenityStory {

    @Steps
    LoginSteps loginSteps;

    @Given("that I am on the sign-in page login")
    public void givenThatIAmOnTheSigninPage() {

    }

    @When("I will login with enter valid my email and password correctly")
    public void whenIWillLoginWithEnterValidMyEmailAndPasswordCorrectly()
    {

        loginSteps.loginSuccess();
    }

    @When("click 'Sign In'")
    public void whenClickSignIn() {

    }

    @Then("I am taken to the dashboard after login")
    public void thenIAmTakenToTheDashboardAfterLogin() {
        loginSteps.validationJSONSchemaLoginSuccess();
    }

    @When("I will login with enter my email only")
    public void whenIWillLoginWithEnterMyEmailOnly() {

        loginSteps.loginFailed();
    }

    @Then("I see an error message 'Missing password' after Login")
    public void thenISeeAnErrorMessageMissingPasswordAfterLogin() {
        loginSteps.validationMessage();
        loginSteps.validationJSONSchemaLoginFailed();
    }
}
