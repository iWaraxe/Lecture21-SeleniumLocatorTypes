package com.coherentsolutions.java.webauto.section05linkText.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME05;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates advanced interactions with an element located by its link text in the DOM Tree using Selenium WebDriver.
 */
public class Ex03AdvancedDomTreeByLinkTextInteraction {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME05);

            // Locate the link element by its text
            WebElement link = driver.findElement(By.linkText("Another text"));

            // Perform a click action on the link element
            link.click();

            // Wait for some time to observe the action (using Thread.sleep for simplicity, WebDriverWait is recommended)
            Thread.sleep(2000);

            // Print out confirmation
            System.out.println("Clicked on link with text 'Another text'");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}