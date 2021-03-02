package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public DriverFactory() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            if (Propriedades.browser == Propriedades.Browsers.CHROME) {
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    //ENCERRA O PROCESSO DO DRIVER
    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }
}
