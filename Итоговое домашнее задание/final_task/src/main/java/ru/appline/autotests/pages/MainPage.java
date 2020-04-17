package ru.appline.autotests.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.appline.autotests.steps.BaseSteps;


/**
 * Created by Maria on 29.04.2017.
 */
public class MainPage extends BasePageObject {


    @FindBy(xpath = "//a[contains(@data-id,'market')]")
    public WebElement menuItems;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}


