package ru.appline.pages;

import ru.appline.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


public class SendAppPage extends BasePageObject {

    @FindBy(id = "surname_vzr_ins_0")
    public WebElement surname_vzr;

    @FindBy(id = "name_vzr_ins_0")
    public WebElement name_vzr;

    @FindBy(id = "birthDate_vzr_ins_0")
    public WebElement birthDate_vzr;

    @FindBy(id = "person_lastName")
    public WebElement person_lastName;

    @FindBy(id = "person_firstName")
    public WebElement person_firstName;

    @FindBy(id = "person_middleName")
    public WebElement person_middleName;

    @FindBy(id = "person_birthDate")
    public WebElement person_birthDate;

    @FindBy(id = "passportSeries")
    public WebElement passportSeries;

    @FindBy(id = "passportNumber")
    public WebElement passportNumber;

    @FindBy(id = "documentDate")
    public WebElement documentDate;

    @FindBy(id = "documentIssue")
    public WebElement documentIssue;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary page__btn')]")
    public WebElement button;

    @FindBy(xpath = "//div[contains(@class,'alert-form alert-form-error')]")
    public WebElement error;

    public SendAppPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(String fieldName, String value){
        switch (fieldName){
            case  "Фамилия застрахованного":
                fillField(surname_vzr, value);
                break;
            case  "Имя застрахованного":
                fillField(name_vzr, value);
                break;
            case  "Дата рождения застрахованного":
                fillField(birthDate_vzr, value);
                break;
            case  "Фамилия":
                fillField(person_lastName, value);
                break;
            case  "Имя":
                fillField(person_firstName, value);
                break;
            case  "Отчество":
                fillField(person_middleName, value);
                break;
            case  "Дата рождения":
                fillField(person_birthDate, value);
                break;
            case  "Серия паспорта":
                fillField(passportSeries, value);
                break;
            case  "Номер паспорта":
                fillField(passportNumber, value);
                break;
            case  "Дата выдачи":
                fillField(documentDate, value);
                break;
            case  "Кем выдан":
                fillField(documentIssue, value);
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }

    public String getFillField(String fieldName){
        switch (fieldName){
            case  "Фамилия застрахованного":
                return surname_vzr.getAttribute("value");
            case  "Имя застрахованного":
                return name_vzr.getAttribute("value");
            case  "Дата рождения застрахованного":
                return birthDate_vzr.getAttribute("value");
            case  "Фамилия":
                return person_lastName.getAttribute("value");
            case  "Имя":
                return person_firstName.getAttribute("value");
            case  "Отчество":
                return person_middleName.getAttribute("value");
            case  "Дата рождения":
                return person_birthDate.getAttribute("value");
            case  "Серия паспорта":
                return passportSeries.getAttribute("value");
            case  "Номер паспорта":
                return passportNumber.getAttribute("value");
            case  "Дата выдачи":
                return documentDate.getAttribute("value");
            case  "Кем выдан":
                return documentIssue.getAttribute("value");
        }
        throw new AssertionError("Поле не объявлено на странице");
    }

    public void checkErrorMessage(String expectedError){
        String actualError = error.getText();
        assertTrue(String.format("Получена ошибка [%s]. Ожидалось - [%s]",
                actualError, expectedError), actualError.contains(expectedError));
    }
}
