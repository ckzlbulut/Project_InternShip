package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement dropSetup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(css = "[href='/citizenships/list']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExams;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExams2;

    @FindBy(xpath = "//*[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//*[text()='Employees']")
    private WebElement Employess;

    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {

        }
        clickFunction(myElement);
    }


}
