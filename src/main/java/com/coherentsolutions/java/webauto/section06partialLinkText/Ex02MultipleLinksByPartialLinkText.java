package com.coherentsolutions.java.webauto.section06partialLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME06;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to locate multiple elements by their partial link text in the DOM Tree using Selenium WebDriver.
 */
public class Ex02MultipleLinksByPartialLinkText {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME06);

            // Locate elements by their partial link text
            List<WebElement> elements = driver.findElements(By.partialLinkText("text"));

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