package ru.appline.tests;

import org.junit.Test;
import ru.appline.steps.*;
import ru.yandex.qatools.allure.annotations.Title;
import java.util.HashMap;

public class ExampleTest extends BaseSteps {

    MainSteps mainSteps = new MainSteps();
    TravelSteps travelSteps = new TravelSteps();
    ChoiceSumSteps choiceSumSteps = new ChoiceSumSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();

    HashMap<String, String> testData = new HashMap<>();


    @Title("Страхование путешественников")
    @Test
    public void Test(){
        testData.put("Фамилия застрахованного","Polyakov");
        testData.put("Имя застрахованного","Sergey");
        testData.put("Дата рождения застрахованного","12.12.1997");
        testData.put("Фамилия","Поляков");
        testData.put("Имя","Сергей");
        testData.put("Отчество","Игоревич");
        testData.put("Дата рождения","12.12.1997");
        testData.put("Серия паспорта","4617");
        testData.put("Номер паспорта","855500");
        testData.put("Дата выдачи","12.12.2017");
        testData.put("Кем выдан","ТП №2 по МО в гор. пос. Люберцы");

        mainSteps.selectMenuItem("Меню Страхование");
        mainSteps.selectMenuInsurance("Страхование путешественников");

        travelSteps.checkPageTitle("Страхование путешественников");
        travelSteps.goToChoiceSumPage();

        choiceSumSteps.choiceSum();
        choiceSumSteps.goToSendAppPage();

        sendAppSteps.fillFields(testData);
        sendAppSteps.checkFillFields(testData);
        sendAppSteps.send();
        sendAppSteps.checkErrorMessage("При заполнении данных произошла ошибка");
    }
}
