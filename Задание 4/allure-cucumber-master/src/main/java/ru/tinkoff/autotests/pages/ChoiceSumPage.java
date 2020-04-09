package ru.tinkoff.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.tinkoff.autotests.steps.BaseSteps;



public class ChoiceSumPage extends BasePageObject{

    @FindBy(xpath = "//h3[text()='Минимальная']")
    public WebElement minimalPolis;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-large')][text()='Оформить']")
    public WebElement button;

    public ChoiceSumPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

}
