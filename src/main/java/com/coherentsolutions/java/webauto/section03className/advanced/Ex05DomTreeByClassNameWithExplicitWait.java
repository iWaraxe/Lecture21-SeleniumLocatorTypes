package com.coherentsolutions.java.webauto.section03className.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME03;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to use explicit wait with an element located by its class name in the DOM Tree using Selenium WebDriver.
 */
public class Ex05DomTreeByClassNameWithExplicitWait {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME03);

            // Set an explicit wait of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the element by its class name using explicit wait
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("element_class")));

            // Perform actions on the located element (e.g., get attribute)
            String src = element.getAttribute("src");
            System.out.println("Image source: " + src);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}