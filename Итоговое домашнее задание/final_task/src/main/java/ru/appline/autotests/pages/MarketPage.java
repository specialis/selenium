package ru.appline.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.appline.autotests.steps.BaseSteps;

import java.util.ArrayList;

public class MarketPage extends BasePageObject {


    @FindBy(xpath = "//div[contains(@data-zone-name,'category-link')]/div/a[contains(@class,'_3Lwc_UVFq4')]/span[text()='Электроника']")
    public WebElement electronicItem;

    @FindBy(xpath = "//span[contains(@class, 'button2__text')][text()='Да, спасибо']")
    public WebElement region;

    public MarketPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
        WebDriver driver = BaseSteps.getDriver();

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        //driver.close();
        //driver.switchTo().window(tabs2.get(0));
    }
}
