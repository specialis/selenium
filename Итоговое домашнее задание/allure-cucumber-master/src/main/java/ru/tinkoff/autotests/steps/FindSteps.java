package ru.tinkoff.autotests.steps;

import ru.tinkoff.autotests.pages.CatalogPage;
import ru.tinkoff.autotests.pages.FindPage;
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
