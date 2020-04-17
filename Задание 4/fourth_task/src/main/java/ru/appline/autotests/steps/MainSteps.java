package ru.appline.autotests.steps;



import ru.appline.autotests.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainSteps {



    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem2){
        new MainPage().selectMenuItem(menuItem2);
    }

    @Step("выбран вид страхования {0}")
    public void selectMenuInsurance(String menuItem){
        new MainPage().selectInsuranceItem(menuItem);
    }

}
