package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }



    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    // @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    //private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(css = "dynamic-view[class='ng-star-inserted']")
    private WebElement  successMessage;
    //div[contains(text(),'successfully')]

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    // @FindBy(xpath = "(//*[@placeholder='GENERAL.FIELD.NAME'])[2]")
    // private WebElement bankAccountName;

    @FindBy(css = "input[data-placeholder='IBAN']")
    private WebElement BankIban;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']")
    private WebElement BankAccCurrency;//

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']//input")
    private WebElement IntCode;


    @FindBy(xpath = "//*[text()=' TRY ']")
    private WebElement Try;//

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement  nameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[text()='Grade Levels']")
    private WebElement GradeLevel;

    @FindBy(xpath = "(//ms-text-field/input)[3]")
    private  WebElement Order;

    @FindBy(xpath = "//*[text()='Next Grade']")
    private WebElement NextGrade;

    @FindBy(xpath = "//*[text()=' Lhomas '] ")
    private WebElement Lhomas;

    //@FindBy(xpath = "//div/ms-edit-button") bu bize 2.user story de edit yapacağımız buton
    //ne kadar grade create edildiyse o kadar sayısı var liste mi atılmalı user story 10

    @FindBy(xpath = "//div/ms-text-field/input")
    private WebElement searchName;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;


    @FindBy(xpath = "//*[contains(@class,'mat-column-name')]")
    public WebElement denemeName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement code;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    //--- SG8_3

    @FindBy(xpath = "//mat-form-field//textarea")
    private WebElement description;
    @FindBy(xpath = "//mat-select[@formcontrolname=\"attachmentStages\"]")
    private WebElement matSelect;
    @FindBy(xpath = "//span[text()=\" Examination \"]")
    private WebElement examination;

    //--SG8_4

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'GENERAL.BUTTON.ADD')]//button")
    private WebElement addButtonField;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    //9-10locators
    @FindBy(xpath ="//ms-text-field[@formcontrolname='description']//input[1]" )
    private WebElement descriptionInput;



    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input[1]")
    private WebElement priorityInput;




    WebElement myElement;
    public void findAndSend(String strElement,String value)
    {
        switch (strElement)
        {
            case "username" : myElement=username;break;
            case "password" : myElement=password;break;
            case "shortName" : myElement=shortNameInput;break;
            case "nameInput":myElement=nameInput;break;
            case "BankIban":myElement=BankIban;break;
            case "IntCode":myElement=IntCode;break;
            case "Order":myElement=Order;break;
            case "searchName":myElement=searchName;break;
            case "code" : myElement=code;break;
            case "searchInput":myElement=searchInput;break;
            case "description": myElement = description;break;
            case "codeInput": myElement =codeInput ;break;
            case "descriptionInput": myElement=descriptionInput;break;
            case "priorityInput":myElement=priorityInput;break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
            case "loginButton" : myElement=loginButton;break;
            case "acceptCookies":myElement=acceptCookies;break;
            case "add":myElement=addButton;break;
            case "saveButton":myElement=saveButton;break;
            case "BankAccCurrency":myElement=BankAccCurrency;break;
            case "Try":myElement=Try;break;
            case "searchButton":myElement=searchButton;break;
            case "editButton":myElement=editButton;break;
            case "NextGrade":myElement=NextGrade;break;
            case "Lhomas":myElement=Lhomas;break;
            case "deleteButton":myElement=deleteButton;break;
            case "deleteDialogBtn":myElement=deleteDialogBtn;break;
            case "addButton":myElement=addButton;break;
            case "matSelect": myElement = matSelect;break;
            case "examination": myElement = examination;break;
            case "addButtonField": myElement =addButtonField ;break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement,String text)
    {
        switch (strElement)
        {
            case "dashboard" : myElement=dashboard;break;
            case "success":myElement=successMessage;break;
        }
        verfyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText)
    {
        findAndSend("searchInput",searchText);
        findAndClick("searchButton");

//        waitUntilLoading();

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");

    }
    public void selectByVisibleText(String strElement,String Text) {

        switch (strElement) {

            case "BankAccCurrency":myElement=BankAccCurrency;break;
        }
        selectFunctionByText(myElement,Text);
    }

    public void selectByIndexText(String strElement,int index) {

        switch (strElement) {

            case "BankAccCurrency":myElement=BankAccCurrency;break;
        }
        selectFunctionByIndex(myElement,index);
    }


}
