package my.company.pages;

import my.company.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChoiceSumPage extends BasePageObject{

    @FindBy(xpath = "//h3[text()='Минимальная']")
    public WebElement minimalPolis;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-large')][text()='Оформить']")
    public WebElement button;

    public ChoiceSumPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}
