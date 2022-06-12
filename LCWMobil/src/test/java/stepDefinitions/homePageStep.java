package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class homePageStep {

    pages.homePage homePage = new pages.homePage(DriverFactory.getDriver());
    @When("click Skip button")
    public void clickSkipButton() {
        homePage.clickSkipButton();
    }

    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();
    }

    @When("click Profil button")
    public void clickProfilButton(){
        homePage.clickProfileButton();
    }


}