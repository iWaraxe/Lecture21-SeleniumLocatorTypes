package com.coherentsolutions.java.webauto.section04tagName.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME04;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates handling dynamic elements located by their tag name in the DOM Tree using Selenium WebDriver.
 */
public class Ex06HandlingDynamicElementsByTagName {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME04);

            // Set an explicit wait of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the button element by its tag name
            WebElement button = driver.findElement(By.tagName("button"));

            // Perform a click action on the button element
            button.click();

            // Wait until the dynamic element is visible
            WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dynamic_content")));

            // Now wait until the element is clickable
            wait.until(ExpectedConditions.elementToBeClickable(dynamicElement));

            // Perform actions on the dynamic element (e.g., click)
            dynamicElement.click();

            // Verify some action or text change
            WebElement resultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dynamic_content")));
            System.out.println("Result content: " + resultElement.getText());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}