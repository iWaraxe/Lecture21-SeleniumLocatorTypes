package com.coherentsolutions.java.webauto.section07cssSelector.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME07;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates handling dynamic elements located by their CSS selector in the DOM Tree using Selenium WebDriver.
 */
public class Ex06HandlingDynamicElementsByCssSelector {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME07);

            // Set an explicit wait of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the button element and click to reveal the dynamic content
            WebElement button = driver.findElement(By.cssSelector("button.button-class"));
            button.click();

            // Wait until the dynamic element is visible
            WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dynamic-content")));

            // Now wait until the element is clickable
            wait.until(ExpectedConditions.elementToBeClickable(dynamicElement));

            // Perform actions on the dynamic element (e.g., click)
            dynamicElement.click();

            // Print out confirmation
            System.out.println("Clicked on dynamic element with CSS selector 'div.dynamic-content'");
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
