package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CheckboxPage;
import util.DriverFactory;

public class CheckboxSteps {

    WebDriver driver = DriverFactory.getDriver();
    CheckboxPage checkboxPage = new CheckboxPage(driver);

    @Given("que estou na página de checkboxes")
    public void que_estou_na_pagina_de_checkboxes() {
        checkboxPage.acessarPagina();
    }

    @When("eu marco o primeiro checkbox")
    public void eu_marco_o_primeiro_checkbox() {
        checkboxPage.marcarCheckbox(0); // index 0
    }

    @Then("o primeiro checkbox deve estar selecionado")
    public void o_primeiro_checkbox_deve_estar_selecionado() {
        Assert.assertTrue(checkboxPage.isSelecionado(0));
    }

    @When("eu desmarco o segundo checkbox")
    public void eu_desmarco_o_segundo_checkbox() {
        checkboxPage.desmarcarCheckbox(1); // index 1
    }

    @Then("o segundo checkbox deve estar desmarcado")
    public void o_segundo_checkbox_deve_estar_desmarcado() {
        Assert.assertFalse(checkboxPage.isSelecionado(1));
    }
}
