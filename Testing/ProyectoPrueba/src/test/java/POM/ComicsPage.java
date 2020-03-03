package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ComicsPage extends BasePage{

    By pageTitleLocator = By.className("page-title");
    private String titlePage = "Category: comics";

    /**public By getPageTitleLocator() {
        return pageTitleLocator;
    }

    public String getTitlePage() {
        return titlePage;
    }**/

    public ComicsPage(WebDriver driver) {
        //Llamamos al constructor de la página base
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {
       return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }
}

