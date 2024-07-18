package com.coherentsolutions.java.webauto.section04tagName;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.coherentsolutions.java.webauto.Main.*;

/**
 * This class demonstrates how to locate elements by their tag name in the DOM Tree using Selenium WebDriver.
 */
public class Ex01DomTreeByTagNameExample {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME04);

            // Locate elements by their tag name
            List<WebElement> elements = driver.findElements(By.tagName("a"));

            // Iterate over the elements and print their text
            for (WebElement element : elements) {
                System.out.println("Link text: " + element.getText());
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}