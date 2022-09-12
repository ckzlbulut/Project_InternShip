package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_DocumentTypesSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Click on the elements in the left nav")
    public void clickOnTheElementsInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("click Anywhere")
    public void clickAnywhere() {
        Actions actions = new Actions(GWD.getDriver());
        actions.click().build().perform();
    }

    @And("User search and delete item from Dialog")
    public void userSearchAndDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.SearchAndDelete(listElement.get(i));
        }
    }
}
