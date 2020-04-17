package ru.appline.autotests.steps;

import ru.appline.autotests.pages.FindPage;
import ru.appline.autotests.pages.CatalogPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FindSteps {

    @Step("Поиск первого элемента")
    public void inputText(){
        new FindPage().text.click();
        String element = new CatalogPage().getfirstE();
        new FindPage().text.sendKeys(element);
        new FindPage().button.click();
    }
}
