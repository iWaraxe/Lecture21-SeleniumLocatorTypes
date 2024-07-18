package com.coherentsolutions.java.webauto.section01id;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME01;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to locate multiple elements with the same ID in the DOM Tree using Selenium WebDriver.
 * Note: In well-formed HTML, IDs should be unique. This example is for demonstration purposes only.
 */
public class Ex02MultipleElementsById {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME01);

            // Locate multiple elements by the same ID (for demonstration purposes)
            List<WebElement> elements = driver.findElements(By.id("shared_id"));

            // Iterate over the elements and print their text content
            for (WebElement element : elements) {
                System.out.println("Element content: " + element.getText());
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}