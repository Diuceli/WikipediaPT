package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {   //Acionar a base
    private Base base;

    public Post(Base base) {  // Conectar na base- Clicar com o lado direito do mouse> Generate> Construtor
        this.base = base;
    }
/*
    @Dado("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url);  // Abre o navegador no site alvo (extendendo da base)
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Entao("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto) {
        assertTrue(base.driver.getTitle().contains(produto));  // importar method static
    }

*/
    @Given("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url);  // Abre o navegador no site alvo (extendendo da base)
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Then("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto) {
        assertTrue(base.driver.getTitle().contains(produto));  // importar method static
    }
}