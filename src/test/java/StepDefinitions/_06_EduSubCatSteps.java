package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _06_EduSubCatSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click element in the left nav bar")
    public void clickElementInTheLeftNavBar(DataTable elements) {
        List<String> listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));

        }
    }

    @And("Click element in the Dialog")
    public void clickElementInTheDialog(DataTable elements) {
        List<String> listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User send keys in Dialog content")
    public void userSendKeysInDialogContent(DataTable elements) {
        List<List<String>> listelements=elements.asLists(String.class);
        for (int i = 0; i < listelements.size(); i++) {
            dc.findAndSend(listelements.get(i).get(0),listelements.get(i).get(1));
        }
    }

    @And("Success messagess should be displayed")
    public void successMessagessShouldBeDisplayed() {
        dc.findAndContainsText("success","successfully");
    }

    @And("User delete from Dialog Ctnn")
    public void userDeleteFromDialogCtnn(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i=0; i<listElement.size(); i++) {
            dc.SearchAndDelete(listElement.get(i));
        }
    }
}