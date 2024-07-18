package com.coherentsolutions.java.webauto.section01id.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME01;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to use implicit wait with an element located by its ID in the DOM Tree using Selenium WebDriver.
 */
public class Ex04DomTreeByIdWithImplicitWait {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Set an implicit wait of 10 seconds
            driver.get(FILE_NAME_STARTER + FILE_NAME01);

            // Navigate to the local HTML file
            driver.get("file:///Users/igorwaraxe/JAVA/JAVA/QA%20Auto%20(Java%20Web%20Automation)/Lectures/Lecture21/Lecture21-SeleniumLocatorTypes/src/main/resources/section01id.html");

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