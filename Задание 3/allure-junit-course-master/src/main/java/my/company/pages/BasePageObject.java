package my.company.pages;


import my.company.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Maria on 06.05.2017.
 */
public class BasePageObject  {

    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(WebElement field, String value){
        field.clear();
        field.click();
        field.sendKeys(value);
    }

}
