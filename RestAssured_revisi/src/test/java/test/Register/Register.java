package test.Register;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Register extends SerenityStory {

    @Steps
    RegisterSteps registerSteps;

    @Given("that I am on the sign-up page for register")
    public void givenThatIAmOnTheSignupPageForRegister(){
    }
    @When("I will register with enter name, my email and password correctly")
    public void whenIWillRegisterWithEnterNameMyEmailAndPasswordCorrectly()
    {
        registerSteps.registerSuccess();
    }
    @When("click 'Sign Up'")
    public void whenClickSignup(){

    }
    @Then("I am taken to the Register page")
    public void thenIAmTakenRegisterPage(){
        registerSteps.validationJSONSchemaRegisterSuccess();

    }

    @When("I will register with enter name, my email only and password empty")
    public void whenIWillRegisterWithEnterNameMyEmailOnlyAndPasswordEmpty()
    {
        registerSteps.registerFailed();
    }
    @Then("Show an error message 'Please Enter password'")
    public void thenShowAnErrorMessagePleaseEnterPassword(){
        registerSteps.validationMessage();
        registerSteps.validationJSONSchemaRegisterFailed();


    }
}
