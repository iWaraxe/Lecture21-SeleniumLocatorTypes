package com.coherentsolutions.java.webauto.section06partialLinkText.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME06;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates advanced interactions with an element located by its partial link text in the DOM Tree using Selenium WebDriver.
 */
public class Ex03AdvancedDomTreeByPartialLinkTextInteraction {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME06);

            // Locate the link element by its partial text
            WebElement link = driver.findElement(By.partialLinkText("Another"));

            // Perform a click action on the link element
            link.click();

            // Wait for some time to observe the action (using Thread.sleep for simplicity, WebDriverWait is recommended)
            Thread.sleep(2000);

            // Print out confirmation
            System.out.println("Clicked on link with partial text 'Another'");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}