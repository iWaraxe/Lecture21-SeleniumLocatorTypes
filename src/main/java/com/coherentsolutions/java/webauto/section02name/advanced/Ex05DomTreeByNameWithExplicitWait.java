package com.coherentsolutions.java.webauto.section02name.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME02;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to use explicit wait with an element located by its name in the DOM Tree using Selenium WebDriver.
 */
public class Ex05DomTreeByNameWithExplicitWait {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME02);

            // Set an explicit wait of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.of(10, ChronoUnit.SECONDS));

            // Locate the element by its name using explicit wait
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("element_name")));

            // Perform actions on the located element (e.g., get text)
            String content = element.getText();
            System.out.println("Element content: " + content);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}