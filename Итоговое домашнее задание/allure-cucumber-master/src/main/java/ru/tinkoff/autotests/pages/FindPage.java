package ru.tinkoff.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.tinkoff.autotests.steps.BaseSteps;

import java.util.ArrayList;

public class FindPage extends BasePageObject {

    @FindBy(id = "text")
    public WebElement text;

    @FindBy(xpath = "//button[contains(@role,'button')]/span[text()='Найти']")
    public WebElement button;


    public FindPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
        WebDriver driver = BaseSteps.getDriver();

        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(0));
    }
}
