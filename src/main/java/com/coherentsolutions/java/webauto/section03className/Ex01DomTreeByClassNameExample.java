package com.coherentsolutions.java.webauto.section03className;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.*;

/**
 * This class demonstrates how to locate an element by its class name in the DOM Tree using Selenium WebDriver.
 */
public class Ex01DomTreeByClassNameExample {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME03);

            // Locate the element by its class name
            WebElement element = driver.findElement(By.className("element_class"));

            // Perform actions on the located element (e.g., get attribute)
            String src = element.getAttribute("src");
            System.out.println("Image source: " + src);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}