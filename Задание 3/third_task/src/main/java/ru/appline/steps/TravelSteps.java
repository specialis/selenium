package ru.appline.steps;

import ru.appline.pages.TravelPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class TravelSteps {

    @Step("заголовок страницы равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new TravelPage().check.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выполнено нажатие на Оформить Онлайн")
    public void goToChoiceSumPage(){
        new TravelPage().button.click();
    }
}
