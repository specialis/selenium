package ru.appline.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.appline.autotests.steps.BaseSteps;

public class ElectronicPage extends BasePageObject {


    @FindBy(xpath = "//a[text()='Телевизоры']")
    public WebElement TV;

    @FindBy(xpath = "//a[text()='Наушники и Bluetooth-гарнитуры']")
    public WebElement headphones;

    public ElectronicPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

}
