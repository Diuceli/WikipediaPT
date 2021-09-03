package simples;

import org.junit.After;  // Importado ao digitar AFTER
import org.junit.Before;  // Importado ao digitar BEFORE
import org.junit.Test;    // Importado ao digitar TESTE
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  // Importado ao digitar WebDriver
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url;   // endereço do site alvo
    WebDriver driver;   // Objeto do Selenium WebDriver

    @Before    // Antes do Teste
    public void iniciar(){
        url = "https://pt.wikipedia.org/";
        System.setProperty("webdriver.chrome.driver","drivers/chrome/88/chromedriver.exe");
        driver = new ChromeDriver();  //Instanciar o Selenium como Chrome Driver

        driver.manage().window().maximize(); //Maximizar a janela do navegador
        //define uma espera implicita de 1 min, verificando o carregamento a dcada milissegundo
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MICROSECONDS);

    }

    @Test  // Durante o Teste
    public void consultarArtigo(){
        // Abrir o site
        driver.get(url);

        // Pesquisar por "Ovo de Páscoa"
        driver.findElement(By.id("searchInput")).sendKeys("Ovo de Páscoa" + Keys.ENTER);
        //driver.findElement(By.id("searchButton")).click();

        // Validar o titulo da pagina de retorno
       //assertEquals("Ovo de Páscoa - Wikipédia, a enciclopédia livre", driver.getTitle()); //import AssertEquals static method
       assertTrue(driver.getTitle().contains("Ovo de Páscoa"));
    }

    @After   // Depois do Teste
    public void finalizar(){
        driver.quit();

    }
}


