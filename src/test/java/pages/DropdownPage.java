package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    private WebDriver driver;

    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPagina() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    public void selecionarOpcao(String opcao) {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(opcao);
    }

    public String obterOpcaoSelecionada() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }
}

