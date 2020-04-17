import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"ru.appline.autotests"},
        plugin = {
            "ru.appline.autotests.util.AllureReporter",
        }
)
public class CucumberRunner {

}
