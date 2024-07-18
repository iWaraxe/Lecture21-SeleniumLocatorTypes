package com.coherentsolutions.java.webauto.section07cssSelector.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME07;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates advanced interactions with elements located by their CSS selector in the DOM Tree using Selenium WebDriver.
 */
public class Ex03AdvancedDomTreeByCssSelectorInteraction {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME07);

            // Locate the button element by its CSS selector
            WebElement button = driver.findElement(By.cssSelector("button.button-class"));

            // Perform a click action on the button element
            button.click();

            // Wait for the dynamic element to appear (using Thread.sleep for simplicity, WebDriverWait is recommended)
            Thread.sleep(2000);

            // Interact with the dynamic element that appears after the click
            WebElement dynamicElement = driver.findElement(By.cssSelector("div.dynamic-content"));
            System.out.println("Dynamic Element content: " + dynamicElement.getText());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
