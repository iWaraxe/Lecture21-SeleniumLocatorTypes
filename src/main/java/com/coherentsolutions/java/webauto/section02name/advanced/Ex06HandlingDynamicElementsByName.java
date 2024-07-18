package com.coherentsolutions.java.webauto.section02name.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME02;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates handling dynamic elements located by their name in the DOM Tree using Selenium WebDriver.
 */
public class Ex06HandlingDynamicElementsByName {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME02);

            // Set an explicit wait of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the submit button element by its name
            WebElement submitButton = driver.findElement(By.name("submit_button"));

            // Perform a click action on the submit button element
            submitButton.click();

            // Wait until the dynamic element is visible
            WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("dynamic_name")));

            // Now wait until the result element is visible
            WebElement resultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("result_name")));
            System.out.println("Result content: " + resultElement.getText());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}