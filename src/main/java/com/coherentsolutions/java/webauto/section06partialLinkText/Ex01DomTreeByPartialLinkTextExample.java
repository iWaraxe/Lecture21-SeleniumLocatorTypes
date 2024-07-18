package com.coherentsolutions.java.webauto.section06partialLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.*;

/**
 * This class demonstrates how to locate an element by its partial link text in the DOM Tree using Selenium WebDriver.
 */
public class Ex01DomTreeByPartialLinkTextExample {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME06);

            // Locate the element by its partial link text
            WebElement element = driver.findElement(By.partialLinkText("text"));

            // Perform actions on the located element (e.g., click)
            element.click();

            // Print out confirmation
            System.out.println("Clicked on link with partial text 'text'");
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}