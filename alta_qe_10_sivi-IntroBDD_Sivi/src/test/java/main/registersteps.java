package main;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class registersteps {
        @Given("Im on page https://www.linkedin.com/")
        public void registerPage() {
        }

        @When("Input all valid data on form registration")
        public void validAccountRegistered() {

        }
        @When("clik 'Join Now'")
        public void joinNow() {
        }

        @Then("Direct to complete profile page")
        public void profilePage() {
        }

        @When("Input all valid data on form registration except firstname")
        public void invalidFirstNameReg() {
        }

        @Then("Show message please enter a valid first name")
        public void inputValidFirstNameReg() {
        }
        @When("Input all valid data on form registration except lastname")
        public void invalidLastNameReg() {
        }

        @Then("Show message please enter a valid last name")
        public void emptyLastNameReg() {
        }
        @When("Input all valid data on form registration except email")
        public void invalidEmailReg() {
        }

        @Then("Show message please enter a valid email")
        public void emptyEmailReg() {
        }
        @When("Input all valid data on form registration and column firstname empty")
        public void emptyFirstNameReg() {
        }

        @Then("Show message please enter firstname")
        public void messageFirstNameReg() {
        }
        @When("Input all valid data on form registration and column lastname empty")
        public void inputLastNameReg() {
        }

        @Then("Show message please enter lastname")
        public void messageLastNameReg() {
        }
        @When("Input all valid data on form registration and column email empty")
        public void columnEmailEmptyReg() {
        }

        @Then("Show message please enter email address")
        public void messageEnterEmailReg() {
        }
        @When("Input all valid data on form registration and column password empty")
        public void columnPasswordEmptyREg() {
        }

        @Then("Show message please enter password")
        public void messageEnterPasswordReg() {
        }

        @When("I click button Sign Up")
        public void signUp() {
        }

        @Then("Direct to page registration new account")
        public void registrationNewAccountPage() {
        }






}

