package com.coherentsolutions.java.webauto.section09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME09;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to locate an immediate child element using CSS selector in Selenium WebDriver.
 */
public class Ex03ImmediateChildElement {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME09);

            // Locate the immediate child element by its CSS selector
            WebElement immediateChildLink = driver.findElement(By.cssSelector("div.secondary > a.link"));

            // Perform actions on the located element (e.g., get text)
            String linkText = immediateChildLink.getText();
            System.out.println("Immediate child link text: " + linkText);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
