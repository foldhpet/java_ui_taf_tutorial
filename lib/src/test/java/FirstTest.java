import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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

    @Test
    public void OpenTheFlowModelPatternArticle() {
        //step 1: Open home page
        driver.get("https://www.peterfoldhazi.com");

        //step 2: Open About page through the menu
        driver.findElement(By.id("comp-kd46oy0r1label")).click();

        //step 3: Open Conferences page through the menu
        driver.findElement(By.id("comp-kd46oy0r2label")).click();
        
        //step 4: Open Articles page through the menu
        driver.findElement(By.id("comp-kd46oy0r3label")).click();
        
        //step 5: Open Blog page through the menu
        driver.findElement(By.id("comp-kd46oy0r4label")).click();
        
        //step 6: Open Contact page through the menu
        driver.findElement(By.id("comp-kd46oy0r5label")).click();
    }
}
