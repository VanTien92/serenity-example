package com.axonvibe.user.dashboard.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(value = "/")
public class TestPage extends PageObject {

    @FindBy(id = "username")
    WebElementFacade userNameElement;

    @FindBy(id = "password")
    WebElementFacade passwordElement;

    @FindBy(className = "login-btn")
    WebElementFacade buttonLogin;

    public void enterUserName(String userName) {
        userNameElement.sendKeys(userName);
    }

    public void enterPassword(String password) {
        passwordElement.sendKeys(password);
    }

    public void clickLogin() {
        buttonLogin.click();
    }
}