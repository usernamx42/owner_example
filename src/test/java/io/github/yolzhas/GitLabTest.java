package io.github.yolzhas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitLabTest {

    private WebDriver driver;

    @BeforeEach
    public void initDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testMainPage() {
        driver.get("https://gitlab.com");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
