package com.aut.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage extends BasePage {

    @FindBy(how = How.XPATH, xpath = "//input[@name='firstName']")
    private WebElement firstNameText;

    @FindBy(how = How.XPATH, xpath = "//input[@name='lastName']")
    private WebElement lastNameText;

    @FindBy(how = How.XPATH, xpath = "//input[@name='address1']")
    private WebElement address1Text;

    @FindBy(how = How.XPATH, xpath = "//input[@name='address2']")
    private WebElement address2Text;

    @FindBy(how = How.XPATH, xpath = "//select[@name='country']")
    private WebElement countryDropdown;


    @FindBy(how = How.XPATH, xpath = "//input[@name='register']")
    private WebElement submitButton;




    public void visit(){
        driver.get(Url.concat("/mercuryregister.php"));
    }

    public void fillContactInformationSection(String firstName, String lastName, String phoneNumber, String email){
        firstNameText.clear();
        firstNameText.sendKeys(firstName);

        lastNameText.clear();
        lastNameText.sendKeys(lastName);

    }

    public void fillMailingInformationSection(String address1, String address2, String city, String stateProvince, String postCode, String country){

        address1Text.clear();
        address1Text.sendKeys(address1);

        address2Text.clear();
        address2Text.sendKeys(address2);

        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText(country);
    }

    public void submitUserRegistrationFrom(){

        submitButton.click();


    }


}
