package com.coherentsolutions.java.webauto.section01id.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME01;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates advanced interactions with an element located by its ID in the DOM Tree using Selenium WebDriver.
 */
public class Ex03AdvancedDomTreeByIdInteraction {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME01);

            // Locate the element by its ID
            WebElement element = driver.findElement(By.id("button_id"));

            // Perform a click action on the located element
            element.click();
            // Wait for the page to load or new elements to appear (using implicit or explicit waits is recommended)
            Thread.sleep(2000); // Use WebDriverWait in real scenarios

            // Interact with another element that appears after the click
            WebElement newElement = driver.findElement(By.id("new_element_id"));
            System.out.println("New Element content: " + newElement.getText());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}