package ru.appline.autotests.steps;

import ru.appline.autotests.pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {
    @Step("выбран раздел Электроника")
    public void selectSection(){
        //new MarketPage().region.click();
        new MarketPage().electronicItem.click();
    }
}
