package ru.tinkoff.autotests.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;

/**
 * Created by m.baykova on 13.09.2017.
 */
public class ScenarioSteps {

    MainSteps mainPageSteps = new MainSteps();

    TravelSteps travelSteps = new TravelSteps();

    ChoiceSumSteps choiceSumSteps = new ChoiceSumSteps();

    SendAppSteps sendAppSteps = new SendAppSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }

    @When("^выбран вид страхования \"(.+)\"$")
    public void selectMenuInsurance(String menuName){
        mainPageSteps.selectMenuInsurance(menuName);
    }

    @Then("^заголовок страницы равен \"(.+)\"$")
    public void checkTitle(String title){
        travelSteps.checkPageTitle(title);
    }

    @When("^выполнено нажатие на кнопку Оформить Онлайн$")
    public void clickBtnSendApp(){
        travelSteps.goToChoiceSumPage();
    }

    @When("^выбрана минимальная сумма страховой защиты$")
    public void choiceSum(){
        choiceSumSteps.choiceSum();
    }

    @Then("^выполнено нажатие на Оформить$")
    public void goToSendAppPage(){ choiceSumSteps.goToSendAppPage(); }


    @When("^заполняются поля:$")
    public void fillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.fillField(field, value));

    }

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.checkFillField(field, value));
    }

    @Then("^выполнено нажатие на Продолжить$")
    public void send(){ sendAppSteps.send(); }

    @Then("^Получена ошибка \"(.+)\"$")
    public void checkErrorMessage(String expectedError){
        sendAppSteps.checkErrorMessage(expectedError);

    }

}
