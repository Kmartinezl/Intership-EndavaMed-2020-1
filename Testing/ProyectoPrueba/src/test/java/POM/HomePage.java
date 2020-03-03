package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{
    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private By titleComicsLocator = By.id("menu-item-2008");

    /**public By getTitleComicsLocator() {

        return titleComicsLocator;
    }

    public String getTitleHomePage() {

        return titleHomePage;
    }**/

    //Constructor para inicializar el driver
    public HomePage(WebDriver driver) {
        //Llamamos al constructor de la página base
        super(driver);
    }

    //ACCIONES

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnTitleComics() throws Exception {
        this.click(titleComicsLocator);
    }
}
