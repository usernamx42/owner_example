package io.github.yolzhas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {

    private WebDriver driver;

    @BeforeEach
    public void initDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testMainPage() {
        final ServiceConfig config = ConfigFactory.newInstance()
                .create(ServiceConfig.class);

        driver.get(config.webUrl());
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
