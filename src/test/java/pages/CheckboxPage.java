package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxPage {
    WebDriver driver;
    By checkboxes = By.cssSelector("#checkboxes input");

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPagina() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    public WebElement getCheckbox(int index) {
        List<WebElement> lista = driver.findElements(checkboxes);
        return lista.get(index);
    }

    public void marcarCheckbox(int index) {
        WebElement checkbox = getCheckbox(index);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void desmarcarCheckbox(int index) {
        WebElement checkbox = getCheckbox(index);
        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isSelecionado(int index) {
        return getCheckbox(index).isSelected();
    }
}

