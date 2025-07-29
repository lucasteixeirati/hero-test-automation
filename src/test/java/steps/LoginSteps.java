package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.BaseTest;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;

    @Given("que o usuário está na página de login")
    public void que_o_usuário_está_na_página_de_login() {
        setup();
        loginPage = new LoginPage(driver);
        loginPage.acessarPaginaLogin();
    }

    @When("preenche o usuário {string} e senha {string}")
    public void preenche_o_usuário_e_senha(String usuario, String senha) {
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
    }

    @And("clica no botão de login")
    public void clica_no_botão_de_login() {
        loginPage.clicarLogin();
    }

    @Then("o login deve ser realizado com sucesso")
    public void o_login_deve_ser_realizado_com_sucesso() {
        Assert.assertTrue(loginPage.obterMensagem().contains("You logged into a secure area!"));
        tearDown();
    }

    @Then("uma mensagem de erro deve ser exibida")
    public void uma_mensagem_de_erro_deve_ser_exibida() {
        Assert.assertTrue(loginPage.obterMensagem().contains("Your username is invalid!") ||
                loginPage.obterMensagem().contains("Your password is invalid!"));
        tearDown();
    }
}
