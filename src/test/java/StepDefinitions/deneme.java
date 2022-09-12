package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import Utilities.GWDBasic;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class deneme {
   /** public deneme() {
     PageFactory.initElements(GWD.getDriver(), this);
     }

     @FindBy(xpath = "(//ms-edit-button//button)[1]")
     public WebElement myEditButton;
     DialogContent dc=new DialogContent();
     @And("deneme Edit")
     public void denemeEdit() {
     WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
     wait.until(ExpectedConditions.visibilityOf(dc.denemeName));
     System.out.println( dc.denemeName.getText());
     List<WebElement> mylist=GWD.getDriver().findElements(By.xpath("//*[contains(@class,'mat-column-name')]"));

     for (WebElement e:mylist){
     System.out.println(e.getText());
     }
     int count=0;

     do {
     count++;


     }while(mylist.get(count).getText().contains("2143"));



     } */
}
