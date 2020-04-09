import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyRefactoringTest extends BaseSteps {



    @Title("Страхование путешественников")
    @Test
    public void Test(){

        MainSteps mainSteps = new MainSteps();
        TravelSteps travelSteps = new TravelSteps();
        ChoiceSumSteps choiceSumSteps = new ChoiceSumSteps();
        SendAppSteps sendAppSteps = new SendAppSteps();

        HashMap<String, String> testData = new HashMap<>();

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

        driver.get(baseUrl + "/");
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