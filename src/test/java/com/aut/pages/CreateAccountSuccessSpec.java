package com.aut.pages;

import com.thoughtworks.gauge.Step;

public class CreateAccountSuccessSpec {
    @Step("Validate user name is <firstName>")
    public void implementation1(String firstName) {

        PageFactory.createAccountSuccessPage.validateFirstNameIs(firstName);

    }
}
