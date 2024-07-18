package com.coherentsolutions.java.webauto.section05linkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.*;

/**
 * This class demonstrates how to locate an element by its link text in the DOM Tree using Selenium WebDriver.
 */
public class Ex01DomTreeByLinkTextExample {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME05);

            // Locate the element by its link text
            WebElement element = driver.findElement(By.linkText("text"));

            // Perform actions on the located element (e.g., click)
            element.click();

            // Print out confirmation
            System.out.println("Clicked on link with text 'text'");
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}