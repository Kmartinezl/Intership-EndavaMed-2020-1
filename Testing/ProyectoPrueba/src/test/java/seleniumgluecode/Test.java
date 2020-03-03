package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test extends TestBase {

    @Given("^El ususario se encuentra en la pagina Home de imalittletester$")
    public void el_ususario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {
        //Comprobar que el usuario sí esté en la página correcta
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
       homePage.clickOnTitleComics();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        Assert.assertTrue("No se redireccionó correctamente a la página de Comics", comicsPage.isTitleComicsDisplayed());
    }


}
