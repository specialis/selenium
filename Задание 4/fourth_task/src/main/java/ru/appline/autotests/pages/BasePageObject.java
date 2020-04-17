package ru.appline.autotests.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.appline.autotests.steps.BaseSteps;



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
