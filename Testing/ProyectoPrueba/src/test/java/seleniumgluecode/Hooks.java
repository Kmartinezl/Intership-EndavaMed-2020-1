package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;


public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before

    //Abrir una instancia del navegador
    public void setUp(){
        numberOfCase ++;
        System.out.println("Se está ejecutando el escenario nro: " + numberOfCase);
        //Devolver una instancia de un navegador
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After

    //Cerrar el navegador
    public void tearDown(){
        System.out.println("El escenario nro: " + numberOfCase + " se ejecutó correctamente. \n");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
