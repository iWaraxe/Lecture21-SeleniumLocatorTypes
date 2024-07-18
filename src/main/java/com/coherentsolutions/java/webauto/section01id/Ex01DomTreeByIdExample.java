package com.coherentsolutions.java.webauto.section01id;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.*;

/**
 * This class demonstrates how to locate an element by its ID in the DOM Tree using Selenium WebDriver.
 */
public class Ex01DomTreeByIdExample {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME01);

            // Locate the element by its ID
            WebElement element = driver.findElement(By.id("element_id"));

            // Perform actions on the located element (e.g., get text)
            String content = element.getText();
            System.out.println("Element content: " + content);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}