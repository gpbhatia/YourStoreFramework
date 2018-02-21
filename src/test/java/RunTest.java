import Utils.Hooks;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
        tags = {"@register"},
        format = {"html:output"})

public class RunTest extends Hooks {



}
