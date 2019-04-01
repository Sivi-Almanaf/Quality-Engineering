package main;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class searchcolleaguesteps {
    @Given("Im on page https://www.linkedin.com/ for find a colleague")
    public void findColleague() {
    }

    @When("Input valid firstname and lastname")
    public void findColleagueValidInput() {

    }
    @When("clik 'Search'")
    public void findColleagueSearch() {
    }

    @Then("Direct to page list people joined in linkedin")
    public void listPeopleJoined() {
    }

    @When("Input just valid firstname")
    public void findColleagueValidFirstName() {

    }
    @When("Input just valid lastname")
    public void findColleagueValidLastName() {
    }
    @When("Input valid firstname and invalid lastname")
    public void findColleagueValidfirstNameInvalidLastName() {

    }
    @When("Input Invalid firstname and valid lastname")
    public void findColleagueInvalidfirstNameValidLastName() {
    }
    @When("Input Invalid firstname and Invalid lastname")
    public void findColleagueInvalidfirstNameLastName() {

    }
    @When("Im click one of Alphabet on list Linkedin member directory")
    public void searchAlphabet() {
    }
    @When("Im click more on Linkedin member directory")
    public void searchMore() {

    }
    @When("Im click browse on Linkedin member directory")
    public void searchBrowse() {
    }
    @Then("Direct to page linkedin for member directory")
    public void memberDirectoryPage() {
    }
    @Then("Direct to page linkedin for member directory 'more'")
    public void memberDirectoryPageMore() {
    }
    @Then("Direct to page linkedin for browse member by country/region")
    public void browseMemberBy() {
    }


}
