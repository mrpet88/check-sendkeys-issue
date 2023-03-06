package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example {

    @Test
    public void amazonInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.nl/");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement searchInput = driver.findElement(By.name("field-keywords"));

        for (int i = 0; i <= 7; i++) {
            String value = searchInput.getAttribute("value");
            if (!value.isEmpty()) {
                searchInput.clear();
            }
            searchInput.sendKeys("Selenium");
        }
        driver.quit();
    }

    @Test
    public void netFlix() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/ie/");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement searchInput = driver.findElement(By.name("email"));

        for (int i = 0; i <= 7; i++) {
            String value = searchInput.getAttribute("value");
            if (!value.isEmpty()) {
                searchInput.clear();
            }
            searchInput.sendKeys("Selenium");
        }
        driver.quit();
    }
}
