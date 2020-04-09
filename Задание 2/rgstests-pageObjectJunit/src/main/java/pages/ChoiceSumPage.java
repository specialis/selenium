package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChoiceSumPage extends BasePage{

    @FindBy(xpath = "//h3[text()='Минимальная']")
    public WebElement minimalPolis;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-large')][text()='Оформить']")
    public WebElement button;

    public ChoiceSumPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
