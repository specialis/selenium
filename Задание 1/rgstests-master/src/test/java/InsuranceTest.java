import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsuranceTest {
  private WebDriver driver;
  private String baseUrl;


  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");

    driver = new ChromeDriver();
    baseUrl = "http://www.sberbank.ru/ru/person";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testInsurance() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//button[contains(@aria-label,'Меню Страхование')]/span[text()='Страхование']")).click();
    driver.findElement(By.xpath("//*[contains(text(),'Страхование путешественников')]")).click();

    assertEquals("Страхование путешественников",
            driver.findElement(By.xpath("//div[contains(@class,'kit-col_xs_12')]/h2[@class='kit-heading kit-heading_l product-teaser-full-width__header']")).getText());

    driver.findElement(By.xpath("//b[contains(@class,'kit-button__text')][text()='Оформить онлайн']")).click();

    driver.findElement(By.xpath("//h3[text()='Минимальная']")).click();
    driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary btn-large')][text()='Оформить']")).click();

    fillField(By.id("surname_vzr_ins_0"), "Polyakov");
    fillField(By.id("name_vzr_ins_0"), "Sergey");
    fillField(By.id("birthDate_vzr_ins_0"), "12.12.1997");

    driver.findElement(By.id("person_lastName")).click();
    fillField(By.id("person_lastName"), "Поляков");
    driver.findElement(By.id("person_firstName")).click();
    fillField(By.id("person_firstName"), "Сергей");
    fillField(By.id("person_middleName"), "Игоревич");
    fillField(By.id("person_birthDate"), "12.12.1997");

    driver.findElement(By.id("passportSeries")).click();
    fillField(By.id("passportSeries"), "4617");
    fillField(By.id("passportNumber"), "855500");
    fillField(By.id("documentDate"), "12.12.2017");
    driver.findElement(By.id("documentIssue")).click();
    fillField(By.id("documentIssue"), "ТП №2 по МО в гор. пос. Люберцы");

    assertEquals("Polyakov", driver.findElement(By.id("surname_vzr_ins_0")).getAttribute("value"));
    assertEquals("Sergey", driver.findElement(By.id("name_vzr_ins_0")).getAttribute("value"));
    assertEquals("12.12.1997", driver.findElement(By.id("birthDate_vzr_ins_0")).getAttribute("value"));

    assertEquals("Поляков", driver.findElement(By.id("person_lastName")).getAttribute("value"));
    assertEquals("Сергей", driver.findElement(By.id("person_firstName")).getAttribute("value"));
    assertEquals("Игоревич", driver.findElement(By.id("person_middleName")).getAttribute("value"));
    assertEquals("12.12.1997", driver.findElement(By.id("person_birthDate")).getAttribute("value"));

    assertEquals("4617", driver.findElement(By.id("passportSeries")).getAttribute("value"));
    assertEquals("855500", driver.findElement(By.id("passportNumber")).getAttribute("value"));
    assertEquals("12.12.2017", driver.findElement(By.id("documentDate")).getAttribute("value"));
    assertEquals("ТП №2 по МО в гор. пос. Люберцы", driver.findElement(By.id("documentIssue")).getAttribute("value"));

    driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary page__btn')]")).click();

    assertEquals("При заполнении данных произошла ошибка",
            driver.findElement(By.xpath("//div[contains(@class,'alert-form alert-form-error')]")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }


  private void fillField(By locator, String value){
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(value);
  }


}
