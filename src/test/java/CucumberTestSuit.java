
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"},
        features = "src/test/resources/features",
        tags ="@Automation"
)
public class CucumberTestSuit {
}
