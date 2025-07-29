package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.JavaScriptAlertsPage;
import utils.DriverFactory;

public class JavaScriptAlertsSteps {
    WebDriver driver = DriverFactory.getDriver();
    JavaScriptAlertsPage alertsPage = new JavaScriptAlertsPage(driver);

    @Given("que estou na página de JavaScript Alerts")
    public void que_estou_na_pagina_de_js_alerts() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @When("clico no botão de alerta simples")
    public void clico_no_botao_de_alerta_simples() {
        alertsPage.clickJsAlert();
    }

    @When("clico no botão de confirmação")
    public void clico_no_botao_de_confirmacao() {
        alertsPage.clickJsConfirm();
    }

    @When("clico no botão de prompt")
    public void clico_no_botao_de_prompt() {
        alertsPage.clickJsPrompt();
    }

    @And("aceito o alerta")
    public void aceito_o_alerta() {
        alertsPage.acceptAlert();
    }

    @And("cancelo o alerta")
    public void cancelo_o_alerta() {
        alertsPage.dismissAlert();
    }

    @And("envio o texto {string} no alerta")
    public void envio_o_texto_no_alerta(String texto) {
        alertsPage.typeInPrompt(texto);
    }

    @Then("vejo a mensagem {string}")
    public void vejo_a_mensagem(String mensagemEsperada) {
        Assert.assertEquals(mensagemEsperada, alertsPage.getResultText());
    }
}
