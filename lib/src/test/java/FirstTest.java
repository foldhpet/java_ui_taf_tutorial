import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    
    protected WebDriver driver;

    @BeforeEach
    private void setup() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
        driver = new FirefoxDriver(options);
    }

    @AfterEach
    private void teardown() {
        driver.quit();
    }

    @Test
    public void OpenHomePage() {
        driver.get("https://www.peterfoldhazi.com");
    }
}
