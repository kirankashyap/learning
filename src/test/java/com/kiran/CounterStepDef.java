package com.kiran;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CounterStepDef {

    private String actualString;

    @Given("^the tanning machine is on$")
    public void the_tanning_machine_is_on() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //just assume all is well :D no code here
    }

    @When("^I ask it to count to (\\d+)$")
    public void i_ask_it_to_count_to(int countUpto) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        actualString = Counter.countString(countUpto);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedString) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expectedString,actualString);
    }


}