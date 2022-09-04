package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    public void waitUntilVisible(WebElement element)
    {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void elementToBeClickable(WebElement element)
    {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void sendKeysFunction(WebElement element,String value)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element)
    {
        elementToBeClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verfyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }
    //DialogContent dc=new DialogContent();
    public void waitUntilLoading() {
        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        //wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
    }

    public void selectFunctionByText(WebElement element,String text)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        Select dd=new Select(element);
        dd.selectByVisibleText(text);
    }

    public void selectFunctionByIndex(WebElement element,int index)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        Select dd=new Select(element);
        dd.selectByIndex(index);
    }


}
