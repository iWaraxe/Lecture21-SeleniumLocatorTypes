package com.coherentsolutions.java.webauto.section09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME09;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to locate an element by its class using CSS selector in Selenium WebDriver.
 */
public class Ex06ElementByClass {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME09);

            // Locate the element by its class
            WebElement userName = driver.findElement(By.cssSelector("input.classname"));

            // Perform actions on the located element (e.g., get value)
            String value = userName.getAttribute("value");
            System.out.println("Input field value: " + value);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
