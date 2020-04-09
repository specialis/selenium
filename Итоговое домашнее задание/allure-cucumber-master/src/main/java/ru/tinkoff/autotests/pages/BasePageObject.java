package ru.tinkoff.autotests.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.tinkoff.autotests.steps.BaseSteps;


/**
 * Created by Maria on 06.05.2017.
 */
public class BasePageObject{

    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(WebElement field, String value) {
        field.click();
        field.clear();
        field.sendKeys(value);
    }

}
