package com.coherentsolutions.java.webauto.section04tagName.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME04;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to use implicit wait with elements located by their tag name in the DOM Tree using Selenium WebDriver.
 */
public class Ex04DomTreeByTagNameWithImplicitWait {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Set an implicit wait of 10 seconds
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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