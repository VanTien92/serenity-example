package com.axonvibe.user.dashboard.actions;

import com.axonvibe.user.dashboard.steps.TestSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.io.IOException;

/**
 * Created by nvtien2 on 12/26/17.
 */
public class Test {
    @Steps
    TestSteps testSteps;

    @Given("Open Fusion website")
    public void openFusionWebsite() {
        testSteps.openFusionWebsite();
    }

    @Then("Enter $username and $password")
    public void enterUserNameAndPassword(String userName, String password) throws IOException {
        testSteps.enterUserNameAndPassword(userName, password);
    }

    @Then("Click Login")
    public void clickLogin(String user) {
        testSteps.clickLogin(user);
    }
}
