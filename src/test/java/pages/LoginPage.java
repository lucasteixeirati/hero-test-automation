package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By usernameInput = By.id("username");
    By passwordInput = By.id("password");
    By loginButton = By.cssSelector("button[type='submit']");
    By flashMessage = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPaginaLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void preencherUsuario(String usuario) {
        driver.findElement(usernameInput).sendKeys(usuario);
    }

    public void preencherSenha(String senha) {
        driver.findElement(passwordInput).sendKeys(senha);
    }

    public void clicarLogin() {
        driver.findElement(loginButton).click();
    }

    public String obterMensagem() {
        return driver.findElement(flashMessage).getText();
    }
}
