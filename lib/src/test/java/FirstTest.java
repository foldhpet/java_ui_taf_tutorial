import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    
    @Test
    public void OpenHomePage() {
        // Setup WebDriver to communicate with FireFox
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
        WebDriver driver = new FirefoxDriver(options);

        // Your test case starts here
        driver.get("https://www.peterfoldhazi.com");
        driver.quit();
    }
}
