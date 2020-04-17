package ru.appline.pages;

import ru.appline.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelPage extends BasePageObject {

    @FindBy(xpath = "//div[contains(@class,'kit-col_xs_12')]/h2[@class='kit-heading kit-heading_l product-teaser-full-width__header']")
    public WebElement check;

    @FindBy(xpath = "//b[contains(@class,'kit-button__text')][text()='Оформить онлайн']")
    public WebElement button;

    public TravelPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}
