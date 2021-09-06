package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false, //rodar a seco pode ser verdadeiro ou falso
        monochrome = false,  // log pode ser verdadeiro ou falso
        features = "src/test/resources/features",  //caminho da feature
        glue = "steps",  //não precisa inserir o caminho,pois ja foi configurado, basta informar a pasta
        plugin = {"pretty",  // plugin/botão mais simples e utilizado
                "html:target/relatorioSimples",  //criar pasta target
                "json:target/relatorioSimples.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
        }

)
public class Runner {
}
