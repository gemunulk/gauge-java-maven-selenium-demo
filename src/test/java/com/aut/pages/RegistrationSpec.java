package com.aut.pages;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

public class RegistrationSpec {
    @Step("On User Registration Page")
    public void implementation1() {
        PageFactory.registrationPage.visit();
    }

    @Step("Fill Contact Information section <table>")
    public void implementation2(Table table){

        for (TableRow row : table.getTableRows()) {

            PageFactory.registrationPage.fillContactInformationSection(
                    row.getCell("FirstName"),
                    row.getCell("LastName"),
                    row.getCell("Phone"),
                    row.getCell("Email")
            );

        }


    }
}
