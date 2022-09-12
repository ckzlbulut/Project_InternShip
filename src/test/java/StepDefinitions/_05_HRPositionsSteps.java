package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _05_HRPositionsSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click on element in the left nav bar")
    public void clickOnElementInTheLeftNavBar(DataTable elements) {
        List<String> listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));

        }
    }

    @And("Click on element in the Dialog")
    public void clickOnElementInTheDialog(DataTable elements) {
        List<String> listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending keys in Dialog content")
    public void userSendingKeysInDialogContent(DataTable elements) {
        List<List<String>> listelements=elements.asLists(String.class);
        for (int i = 0; i < listelements.size(); i++) {
            dc.findAndSend(listelements.get(i).get(0),listelements.get(i).get(1));
        }
    }

    @And("Success messages should be displayed")
    public void successMessagesShouldBeDisplayed() {
        dc.findAndContainsText("success","successfully");
    }

    @And("User delete from Dialog Ctn")
    public void userDeleteFromDialogCtn(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i=0; i<listElement.size(); i++) {
            dc.SearchAndDelete(listElement.get(i));
        }
    }
}