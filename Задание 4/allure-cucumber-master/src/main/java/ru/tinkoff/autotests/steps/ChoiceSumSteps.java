package ru.tinkoff.autotests.steps;

import ru.tinkoff.autotests.pages.ChoiceSumPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ChoiceSumSteps {

    @Step("выбрана минимальная сумма страховой защиты")
    public void choiceSum(){
        new ChoiceSumPage().minimalPolis.click();
    }

    @Step("выполнено нажатие на Оформить")
    public void goToSendAppPage(){
        new ChoiceSumPage().button.click();
    }

}
