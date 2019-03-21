package com.kiran;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MississipiCounterStepDef {
    String actualResult;

    @Given("^someone wants to count missisipily$")
    public void someone_wants_to_count_missisipily() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I ask to count to (\\d+)$")
    public void i_ask_to_count_to(int givenCount) throws Exception {
        // Write code here that turns the phrase above into concrete actions
       actualResult=Counter.countString(givenCount,true);
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String expectedString) throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

}
