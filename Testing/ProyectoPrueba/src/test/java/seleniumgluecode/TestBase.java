package seleniumgluecode;

import POM.ComicsPage;
import POM.HomePage;
import org.openqa.selenium.WebDriver;

public class TestBase {

    //Inicializar Hook para obtener el driver
    protected WebDriver driver = Hooks.getDriver();

    //Crear objetos de HomePage y ComicsPage
    protected HomePage homePage = new HomePage(driver);
    protected ComicsPage comicsPage = new ComicsPage(driver);
}
