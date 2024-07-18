package com.coherentsolutions.java.webauto.section04tagName.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME04;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to use explicit wait with elements located by their tag name in the DOM Tree using Selenium WebDriver.
 */
public class Ex05DomTreeByTagNameWithExplicitWait {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME04);

            // Set an explicit wait of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate elements by their tag name using explicit wait
            List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));

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