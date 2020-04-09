package ru.tinkoff.autotests.steps;

import ru.tinkoff.autotests.pages.ElectronicPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicSteps {

    @Step("выбран раздел Телевизоры")
    public void selectTV(){
        new ElectronicPage().TV.click();
    }

    @Step("выбран раздел Наушники")
    public void selectHeadphones(){
        new ElectronicPage().headphones.click();
    }
}
