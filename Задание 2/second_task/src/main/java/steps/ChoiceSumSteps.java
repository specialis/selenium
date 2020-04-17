package steps;

import pages.ChoiceSumPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ChoiceSumSteps extends BaseSteps{

    @Step("выбрана минимальная сумма страховой защиты")
    public void choiceSum(){
        new ChoiceSumPage(driver).minimalPolis.click();
    }

    @Step("выполнено нажатие на Оформить")
    public void goToSendAppPage(){
        new ChoiceSumPage(driver).button.click();
    }

}
