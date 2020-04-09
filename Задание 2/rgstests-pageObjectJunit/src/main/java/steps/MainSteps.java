package steps;



import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Maria on 29.04.2017.
 */
public class MainSteps extends BaseSteps{



    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem2){
        new MainPage(driver).selectMenuItem(menuItem2);
    }

    @Step("выбран вид страхования {0}")
    public void selectMenuInsurance(String menuItem){
        new MainPage(driver).selectInsuranceItem(menuItem);
    }

}
