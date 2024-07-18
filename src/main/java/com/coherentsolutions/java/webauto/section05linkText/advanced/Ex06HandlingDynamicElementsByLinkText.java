package com.coherentsolutions.java.webauto.section05linkText.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME05;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates handling dynamic elements located by their link text in the DOM Tree using Selenium WebDriver.
 */
public class Ex06HandlingDynamicElementsByLinkText {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME05);

            // Set an explicit wait of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the button element and click to reveal the dynamic link
            WebElement button = driver.findElement(By.tagName("button"));
            button.click();

            // Wait until the dynamic link is visible
            WebElement dynamicLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Dynamic Link")));

            // Now wait until the link is clickable
            wait.until(ExpectedConditions.elementToBeClickable(dynamicLink));

            // Perform actions on the dynamic link (e.g., click)
            dynamicLink.click();

            // Print out confirmation
            System.out.println("Clicked on dynamic link with text 'Dynamic Link'");
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}