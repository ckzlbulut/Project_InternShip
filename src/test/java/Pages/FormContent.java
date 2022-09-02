package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    WebElement myElement;
    public void findAndSend(String strElement,String value)
    {
        switch (strElement)
        {

        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement)
    {
        switch (strElement)
        {


        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement,String text)
    {
        switch (strElement)
        {

        }
        verfyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText)
    {
//        findAndSend("searchInput",searchText);
//        findAndClick("searchButton");
//        waitUntilLoading();
//        findAndClick("deleteButton");
//        findAndClick("deleteDialogBtn");

    }

}
