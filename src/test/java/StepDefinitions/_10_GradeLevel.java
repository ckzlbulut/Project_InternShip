package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWDBasic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class _10_GradeLevel {
    DialogContent dialogC=new DialogContent();

    LeftNav lnav=new LeftNav();

    @Given("Grade level  tab should be under the Setup  Parameters tab.")
    public void gradeLevelTabShouldBeUnderTheSetupParametersTab() {
      lnav.findAndClick("setup");
      lnav.findAndClick("parameters");
      lnav.findAndClick("GradeLevel");

    }

    @And("User sending the keys in page")
    public void userSendingTheKeysInPage(DataTable elements) {
        List<List<String>> listelements=elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++) {
            dialogC.findAndSend(listelements.get(i).get(0),listelements.get(i).get(1));
        }

    }
    @And("click Next Grade")
    public void clickNextGrade() {
     dialogC.findAndClick("NextGrade");
        GWDBasic.Bekle(2);
     dialogC.findAndClick("Lhomas");
    }

    @And("click And edit Button")
    public void clickAndEditButton() {
        GWDBasic.Bekle(2);
        dialogC.findAndClick("editButton");

    }
}
