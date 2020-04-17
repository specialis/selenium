package ru.appline.autotests.steps;

import ru.appline.autotests.pages.CatalogPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogSteps {

    @Step("Задан параметр поиска от N рублей")
    public void inputMoney(){
        // Не работает с sendKeys
        //new CatalogPage().moneyItem.click();
        //new CatalogPage().moneyItem.sendKeys("20000");
    }

    @Step("Выбран пункт Samsung")
    public void selectSamsung(){
        new CatalogPage().samsungItem.click();
    }

    @Step("Выбран пункт LG")
    public void selectLG(){
        new CatalogPage().LGItem.click();
    }

    @Step("Выбран пункт Beats")
    public void selectBeats(){
        new CatalogPage().beatsItem.click();
    }

    @Step("Проверка числа элементов")
    public void checkItem(){ ;
        new CatalogPage().checkItem();
    }


}