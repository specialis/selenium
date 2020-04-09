package ru.tinkoff.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.tinkoff.autotests.steps.BaseSteps;

import java.util.ArrayList;
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
               System.out.println("Элементов больше 12!");
           }
        }
    }

}
