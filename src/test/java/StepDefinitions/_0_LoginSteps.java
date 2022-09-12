package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _0_LoginSteps {

    DialogContent dc=new DialogContent();
    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter the username and password and click login button")
    public void enterTheUsernameAndPasswordAndClickLoginButton() {
        dc.findAndSend("username","richfield.edu");
        dc.findAndSend("password","Richfield2020!");
        dc.findAndClick("loginButton");
    }

    @Then("User should be successfully")
    public void userShouldBeSuccessfully() {
        dc.findAndContainsText("dashboard","Dashboard");
        dc.findAndClick("acceptCookies");
    }
}
