package my.company.steps;

import my.company.pages.ChoiceSumPage;
import my.company.pages.TravelPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

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
