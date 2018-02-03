package com.axonvibe.user.dashboard.steps;

import com.axonvibe.user.dashboard.pages.TestPage;
import net.thucydides.core.pages.PageObject;

/**
 * Created by nvtien2 on 12/26/17.
 */
public class TestSteps {

    TestPage testPage;

    public void openFusionWebsite() {
        testPage.open();
    }

    public void enterUserNameAndPassword(String userName, String password) {
        testPage.enterUserName(userName);
        testPage.enterPassword(password);
    }

    public void clickLogin(String user) {
        testPage.clickLogin();
    }
}
