package ru.appline.autotests.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.appline.autotests.steps.BaseSteps;


public class MainPage extends BasePageObject {


    @FindBy(xpath = "//ul[contains(@class,'lg-menu__list')]")
    WebElement menuItems;

    @FindBy(xpath = "//ul[contains(@class,'lg-menu__sub-list')]")
    WebElement menuInsurance;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//li/button[contains(@aria-label,'"+itemName+"')]")).click(); // Меню Страхование
    }

    public void selectInsuranceItem(String itemName){
        menuInsurance.findElement(By.xpath("//li/a[contains(text(),'"+itemName+"')]")).click(); // Страхование путешественников
    }
}


