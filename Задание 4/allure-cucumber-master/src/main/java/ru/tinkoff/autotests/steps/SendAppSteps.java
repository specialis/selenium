package ru.tinkoff.autotests.steps;


import ru.tinkoff.autotests.pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

/**
 * Created by Maria on 06.05.2017.
 */
public class SendAppSteps{

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value) {
        new SendAppPage().fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = new SendAppPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("Получена ошибка")
    public void checkErrorMessage(String expectedError){
        new SendAppPage().checkErrorMessage(expectedError);
    }

    @Step("выполнено нажатие на Продолжить")
    public void send(){
        new SendAppPage().button.click();
    }


    /*@Step("заполняются поля")
    public void fillFields(HashMap<String, String> fields){
        fields.forEach((k, v)-> fillField(k,v));
    }

    @Step("поля заполнены верно")
    public void checkFillFields(HashMap<String, String> fields){
        fields.forEach((k, v)-> checkFillField(k,v));
    }*/
}
