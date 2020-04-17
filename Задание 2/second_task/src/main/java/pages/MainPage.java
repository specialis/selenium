package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    @FindBy(xpath = "//ul[contains(@class,'lg-menu__list')]")
    WebElement menuItems;

    @FindBy(xpath = "//ul[contains(@class,'lg-menu__sub-list')]")
    WebElement menuInsurance;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//li/button[contains(@aria-label,'"+itemName+"')]")).click(); // Меню Страхование
    }

    public void selectInsuranceItem(String itemName){
        menuInsurance.findElement(By.xpath("//li/a[contains(text(),'"+itemName+"')]")).click(); // Страхование путешественников
    }
}
