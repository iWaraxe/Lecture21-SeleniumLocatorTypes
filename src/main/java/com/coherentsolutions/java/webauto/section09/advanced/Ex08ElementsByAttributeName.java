package com.coherentsolutions.java.webauto.section09.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME09;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to locate elements by their attribute name using CSS selector in Selenium WebDriver.
 */
public class Ex08ElementsByAttributeName {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME09);

            // Locate elements by their attribute name
            List<WebElement> imagesWithAlt = driver.findElements(By.cssSelector("img[alt]"));

            // Iterate over the elements and print their alt attribute
            for (WebElement image : imagesWithAlt) {
                System.out.println("Image alt attribute: " + image.getAttribute("alt"));
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
