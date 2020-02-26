package seleniumgluecode;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

    private ChromeDriver driver;

    @Given("^El ususario se encuentra en la pagina Home de imalittletester$")
    public void el_ususario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
        //throw new PendingException();
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
        titleComicsLocator.click();
        //throw new PendingException();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        WebElement pageTitleLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redireccionó correctamente a la página de Comics", pageTitleLocator.isDisplayed());
        Assert.assertEquals("Category: comics", pageTitleLocator.getText());
        driver.quit();
        //throw new PendingException();
    }


}
