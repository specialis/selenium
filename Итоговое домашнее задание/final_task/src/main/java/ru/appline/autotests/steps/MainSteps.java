package ru.appline.autotests.steps;



import ru.appline.autotests.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Maria on 29.04.2017.
 */
public class MainSteps {

    @Step("выбран пункт меню Маркет")
    public void selectMenuItem(){
        new MainPage().menuItems.click();
    }

}
