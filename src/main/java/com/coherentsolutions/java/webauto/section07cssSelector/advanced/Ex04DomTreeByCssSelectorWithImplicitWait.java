package com.coherentsolutions.java.webauto.section07cssSelector.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME07;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to use implicit wait with elements located by their CSS selector in the DOM Tree using Selenium WebDriver.
 */
public class Ex04DomTreeByCssSelectorWithImplicitWait {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Set an implicit wait of 10 seconds
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME07);

            // Locate the element by its CSS selector
            WebElement element = driver.findElement(By.cssSelector("div.main"));

            // Perform actions on the located element (e.g., get text)
            String content = element.getText();
            System.out.println("Element content: " + content);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
