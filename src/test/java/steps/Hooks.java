package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base;

    public Hooks(Base base) {   // Clicar com o lado direito Generate> Construtor
        this.base = base;
    }

    @Before   // Importar cucumber
    public void setup(){
        System.setProperty("webdriver.chrome.driver","drivers/chrome/88/chromedriver.exe");
        base.driver = new ChromeDriver();   //Importar Selenium

        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait( 60000, TimeUnit.MILLISECONDS);


    }
    @After
    public void tearDown(){   // finalizar
        base.driver.quit();
    }

}

