package ru.appline.autotests.steps;

import ru.appline.autotests.pages.CatalogPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogSteps {

    String element;

    @Step("Задан параметр поиска от \"(.+)\" рублей")
    public void inputMoney(String price){
        new CatalogPage().moneyItem.click();
        new CatalogPage().moneyItem.sendKeys(price);
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
    public void checkItem(){

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new CatalogPage().checkItem();

    }

    @Step("Поиск первого элемента")
    public void inputText(){
        new CatalogPage().search.click();
        element = new CatalogPage().getfirstE();
        new CatalogPage().search.sendKeys(element);
        new CatalogPage().button.click();
    }

    @Step("Проверка числа элементов")
    public void checkText(){

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String oldElement = element;// товар до поиска
        String element = new CatalogPage().getfirstE();

        if(oldElement.equals(element)) {
            System.out.println("Новый товар: " + element + " соответствует товару из прошлого поиска: " + oldElement);
        } else {
            System.out.println("Новый товар: " + element + " не соответствует товару из прошлого поиска:" + oldElement);
        }
    }


}