package runnertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//OPÇÕES DE CONFIGURAÇÃO DO CUCUMBER E JUNIT
@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"features"},
        glue = {"steps"},
        //tags = {""},
        plugin = {"pretty", "html:target/report-html",
                "json:target/report.json",
                "junit:target/cucumber.xml"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
        /*strict = true*/)

public class RunnerTest {

}
