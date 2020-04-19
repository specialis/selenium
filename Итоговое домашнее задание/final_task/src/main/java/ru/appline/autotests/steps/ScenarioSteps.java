package ru.appline.autotests.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by m.baykova on 13.09.2017.
 */
public class ScenarioSteps {

    MainSteps mainPageSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicSteps electronicSteps = new ElectronicSteps();
    CatalogSteps catalogSteps = new CatalogSteps();

    @When("^выбран пункт меню Маркет$")
    public void selectMenuItem(){
        mainPageSteps.selectMenuItem();
    }

    @When("^выбран раздел Электроника$")
    public void selectSection(){
        marketSteps.selectSection();
    }

    @Then("^выбран раздел Телевизоры$")
    public void selectTV(){ electronicSteps.selectTV(); }

    @Then("^выбран раздел Наушники$")
    public void selectHeadphones(){ electronicSteps.selectHeadphones(); }

    @When("^Задан параметр поиска от \"(.+)\" рублей$")
    public void inputMoney(String price){
        catalogSteps.inputMoney(price);
    }

    @When("^Выбран пункт Samsung$")
    public void selectSamsung(){
        catalogSteps.selectSamsung();
    }

    @When("^Выбран пункт LG$")
    public void selectLG(){
        catalogSteps.selectLG();
    }

    @When("^Выбран пункт Beats$")
    public void selectBeats(){
        catalogSteps.selectBeats();
    }

    @Then("^Проверка числа элементов$")
    public void checkItem(){
        catalogSteps.checkItem();
    }

    @When("^Ввод в поисковую строку$")
    public void inputText(){
        catalogSteps.inputText();
    }

    @Then("^Проверка наименования товара$")
    public void checkText(){
        catalogSteps.checkText();
    }


}
