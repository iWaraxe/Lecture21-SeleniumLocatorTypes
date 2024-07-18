package com.coherentsolutions.java.webauto.section09.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME09;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to locate an element by the start of its attribute string using CSS selector in Selenium WebDriver.
 */
public class Ex09ElementByStartOfString {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME09);

            // Locate the element by the start of its attribute string
            WebElement header = driver.findElement(By.cssSelector("header[id^='page-']"));

            // Perform actions on the located element (e.g., get text)
            String headerContent = header.getText();
            System.out.println("Header content: " + headerContent);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
