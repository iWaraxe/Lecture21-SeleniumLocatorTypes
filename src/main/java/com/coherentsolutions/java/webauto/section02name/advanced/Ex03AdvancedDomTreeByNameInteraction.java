package com.coherentsolutions.java.webauto.section02name.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME02;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates advanced interactions with an element located by its name in the DOM Tree using Selenium WebDriver.
 */
public class Ex03AdvancedDomTreeByNameInteraction {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME02);

            // Locate the button element by its name
            WebElement button = driver.findElement(By.name("submit_button"));

            // Perform a click action on the button element
            button.click();

            // Wait for the new element to appear
            Thread.sleep(2000); // Use WebDriverWait in real scenarios

            // Interact with the dynamic element that appears after the click
            WebElement dynamicElement = driver.findElement(By.name("dynamic_name"));
            System.out.println("Dynamic Element content: " + dynamicElement.getText());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}