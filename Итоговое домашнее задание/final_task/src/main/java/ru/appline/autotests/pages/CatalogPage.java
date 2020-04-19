package ru.appline.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.appline.autotests.steps.BaseSteps;

import java.util.List;

public class CatalogPage extends BasePageObject {

    @FindBy(name = "Цена от")
    public WebElement moneyItem;

    @FindBy(xpath = "//span[text()='Samsung']")
    public WebElement samsungItem;

    @FindBy(xpath = "//span[text()='LG']")
    public WebElement LGItem;

    @FindBy(xpath = "//span[text()='Beats']")
    public WebElement beatsItem;

    @FindBy(xpath = "//h3[contains(@class,'n-snippet-card2__title')]")
    public List<WebElement> items;

    @FindBy(id = "header-search")
    public WebElement search;

    @FindBy(xpath = "//span[contains(@class,'search2__button')]/button")
    public WebElement button;

    public CatalogPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public String getfirstE() {
        return items.get(0).getText();
    }

    public void checkItem() {
        for (int i = 0; i < items.size(); i++) {
           System.out.println(items.get(i).getText());
           if(i==12) {
               System.out.println("----------------------------Элементов больше 12!-----------------------------------------");
           }
        }
    }

}
