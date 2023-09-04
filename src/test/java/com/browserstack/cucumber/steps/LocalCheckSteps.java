package com.browserstack.cucumber.steps;

import io.cucumber.java.en.Then;
import com.browserstack.cucumber.pages.LocalPage;

public class LocalCheckSteps {
    LocalPage localPage;

    @Then("^I should see \"([^\"]*)\"$")
    public void matchTitle(String matchTitle) throws Throwable {
        localPage.open();
        localPage.bodyShouldMatch(matchTitle);
    }
}
