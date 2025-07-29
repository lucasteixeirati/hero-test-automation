package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;

    private By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJsAlert() {
        driver.findElement(jsAlertButton).click();
    }

    public void clickJsConfirm() {
        driver.findElement(jsConfirmButton).click();
    }

    public void clickJsPrompt() {
        driver.findElement(jsPromptButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void typeInPrompt(String text) {
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys(text);
        prompt.accept();
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}

