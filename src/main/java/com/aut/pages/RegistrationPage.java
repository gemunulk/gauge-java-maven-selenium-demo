package com.aut.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegistrationPage extends BasePage {

    @FindBy(how = How.XPATH, xpath = "//input[@name='firstName']")
    private WebElement firstNameText;

    @FindBy(how = How.XPATH, xpath = "//input[@name='lastName']")
    private WebElement lastNameText;

    public void visit(){
        driver.get(Url.concat("/mercuryregister.php"));
    }

    public void fillContactInformationSection(String firstName, String lastName, String phoneNumber, String email){
        firstNameText.clear();
        firstNameText.sendKeys(firstName);

        lastNameText.clear();
        lastNameText.sendKeys(lastName);

    }

}
