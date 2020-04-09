package ru.tinkoff.autotests.steps;

import ru.tinkoff.autotests.pages.MainPage;
import ru.tinkoff.autotests.pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {
    @Step("выбран раздел Электроника")
    public void selectSection(){
        //new MarketPage().region.click();
        new MarketPage().electronicItem.click();
    }
}
