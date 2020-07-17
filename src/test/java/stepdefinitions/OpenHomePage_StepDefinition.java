package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.FilteredResults_Question;
import task.OpenShoreExcursionPage_Task;
import task.OpenSite_Task;
import task.SelectDestination_Task;
import task.SelectPort_Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static user_interface.HomePage.URL;


public class OpenHomePage_StepDefinition {

    @Before
    public void prepareScenario() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^The guest has logged into the homepage$")
    public void theGuestHasLoggedIntoTheHomepage() {

        // This section opens the original website (https://www.ncl.com/)
        theActorCalled("The User").wasAbleTo(OpenSite_Task.to(URL));

    }


    @When("^The guest navigates to the '(.*)' Page$")
    public void theGuestNavigatesToThePage(String arg1) {
       //This section navigates to the Shore Excursion Page
        theActorInTheSpotlight().attemptsTo(OpenShoreExcursionPage_Task.goesTo());
    }


    @And("^The guest searches for '(.*)' destination$")

    public void theGuestSelectsTheDestinationDropdown(String destination_from_feature) {
        // This section select the destionation drop down arrow then inserts the destination text
        theActorInTheSpotlight().attemptsTo(SelectDestination_Task.choosedestination(destination_from_feature));
    }


    @And("^The guest filters for the '(.*)' port$")
    public void theGuestFiltersForTheVancouverBritishColumbiaPort(String port_from_feature) {
        Serenity.setSessionVariable("port_name").to(port_from_feature);

        // This section select the port drop down arrow then inserts the port text
        theActorInTheSpotlight().attemptsTo(SelectPort_Task.chooseport(port_from_feature));
    }


    @Then("^The results are filtered by name of the port$")
    public void theResultsAreFilteredByNameOfThePort() {
        // This section confirms the results quantity matches based upon text and count
        theActorInTheSpotlight().should(seeThat(FilteredResults_Question.equalToPort(), equalTo(true)));
    }

}
