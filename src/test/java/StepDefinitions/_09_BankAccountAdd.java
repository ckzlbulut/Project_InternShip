package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWDBasic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _09_BankAccountAdd {

    LeftNav left=new LeftNav();

    DialogContent dialogC=new DialogContent();

    @Given("Bank Accounts tab should be under the Setup  Parameters tab.")
    public void bankAccountsTabShouldBeUnderTheSetupParametersTab() {
        left.findAndClick("setup");
        left.findAndClick("parameters");
        left.findAndClick("BankAccounts");

    }



    @And("user select choose currently from Dialog Content")
    public void userSelectChooseCurrentlyFromDialogContent() {
      //  dialogC.selectByIndexText("BankAccCurrency",3);
      dialogC.findAndClick("BankAccCurrency");
      dialogC.findAndClick("Try");
    }


    @And("Search for the name you gave for the edit")
    public void searchForTheNameYouGaveForTheEdit(DataTable elements) {
        List<List<String>> listelements=elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++) {
            dialogC.findAndSend(listelements.get(i).get(0),listelements.get(i).get(1));
        }

    }


    @And("click the Search button,editButton")
    public void clickTheSearchButtonEditButton(DataTable elements) {
        List<String> listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dialogC.findAndClick(listElement.get(i)); //burda editButtona tıklamıyor
        }
    }

    @And("click the edit buton")
    public void clickTheEditButon() {
        GWDBasic.Bekle(2);
        dialogC.findAndClick("editButton");
    }

    @When("I change the name")
    public void ıChangeTheName(DataTable elements) {
        List<List<String>> listelements=elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++) {
            dialogC.findAndSend(listelements.get(i).get(0),listelements.get(i).get(1));
        }
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog() {
     GWDBasic.Bekle(2);
     dialogC.findAndClick("deleteButton");
     dialogC.findAndClick("deleteDialogBtn");
    }
}
