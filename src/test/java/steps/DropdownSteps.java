package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DropdownPage;
import utils.DriverFactory;

public class DropdownSteps {

    WebDriver driver = DriverFactory.getDriver();
    DropdownPage dropdownPage = new DropdownPage(driver);
    String opcaoSelecionada;

    @Dado("que estou na página de dropdown")
    public void que_estou_na_pagina_de_dropdown() {
        dropdownPage.acessarPagina();
    }

    @Quando("seleciono a opção {string}")
    public void seleciono_a_opcao(String opcao) {
        dropdownPage.selecionarOpcao(opcao);
    }

    @Entao("a opção {string} deve estar selecionada")
    public void a_opcao_deve_estar_selecionada(String opcaoEsperada) {
        opcaoSelecionada = dropdownPage.obterOpcaoSelecionada();
        Assert.assertEquals(opcaoEsperada, opcaoSelecionada);
    }
}

