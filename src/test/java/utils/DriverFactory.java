package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup(); // Gerencia o driver do Chrome
            driver = new ChromeDriver();
            driver.manage().window().maximize(); // Maximiza a janela ao iniciar
        }
        return driver;
    }

    public static void fecharDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
