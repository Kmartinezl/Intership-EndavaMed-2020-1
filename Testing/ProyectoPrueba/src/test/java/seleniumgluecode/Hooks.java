package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberOfCase = 0;

    @Before

    //Abrir una instancia del navegador
    public void setUp(){
        numberOfCase ++;
        System.out.println("Se está ejecutando el escenario nro: " + numberOfCase);
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After

    //Cerrar el navegador
    public void tearDown(){
        System.out.println("El escenario nro: " + numberOfCase + " se ejecutó correctamente. \n");
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
