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

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupHuman;


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

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;


    @FindBy(xpath = "//*[text()='Employees']")
    private WebElement Employess;


    @FindBy(xpath = "//*[text()='Bank Accounts']")
    private WebElement BankAccounts;

    @FindBy(xpath = "//*[text()='Grade Levels']")
    private WebElement GradeLevel;

    @FindBy(xpath = "//*[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupEducation;

    @FindBy(xpath = "//*[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "//*[text() =\"Document Types\" ]")
    private WebElement documentTypes;

    @FindBy (xpath = "(//span[text()='Fields'])[1]")
    private WebElement fields;

    //9-10locators
    @FindBy(xpath ="//*[text()='Discounts']" )
    private WebElement discounts;

    WebElement myElement;

    public  void findAndClick(String strElement) {
        switch (strElement) {
            case "humanResources":myElement=humanResources;break;
            case "setupHuman":myElement=setupHuman;break;
            case "position":myElement=positions;break;
            case "setup":myElement=setup;break;
            case "parameters":myElement=parameters;break;
            case "BankAccounts":myElement=BankAccounts;break;
            case "GradeLevel":myElement=GradeLevel;break;
            case "positions":myElement=positions;break;
            case "education" : myElement=education;break;
            case "setupEducation" : myElement=setupEducation;break;
            case "subjectCategories" : myElement=subjectCategories;break;
            case "documentTypes": myElement = documentTypes;break;
            case "fields": myElement = fields;break;
            case "discounts": myElement=discounts; break;
        }
        clickFunction(myElement);
    }


}
