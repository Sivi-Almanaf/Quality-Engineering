package test.Login;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Login extends SerenityStory {

    @Steps
    LoginSteps loginSteps;

    @Given("that I am on the sign-in page")
    public void givenThatIAmOnTheSigninPage() {

    }

    @When("I enter valid my email and password correctly")
    public void whenIEnterValidMyEmailAndPasswordCorrectly()
    {
        loginSteps.loginSuccess();
    }

    @When("click 'Sign In'")
    public void whenClickSignIn() {

    }

    @Then("I am taken to the dashboard")
    public void thenIAmTakenToTheDashboard() {
        loginSteps.validationJSONSchemaLoginSuccess();
    }

    @When("I enter my email only")
    public void whenIEnterMyUserNameAndPasswordIncorrectly() {

        loginSteps.loginFailed();
    }

    @Then("I see an error message 'Missing password'")
    public void thenISeeAnErrorMessageSorryIncorrectUserNameOrPassword() {
        loginSteps.validationMessage();
        loginSteps.validationJSONSchemaLoginFailed();
    }
}
