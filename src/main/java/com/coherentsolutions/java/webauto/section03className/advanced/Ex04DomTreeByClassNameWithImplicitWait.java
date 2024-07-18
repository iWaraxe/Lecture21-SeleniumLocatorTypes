package com.coherentsolutions.java.webauto.section03className.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME03;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to use implicit wait with an element located by its class name in the DOM Tree using Selenium WebDriver.
 */
public class Ex04DomTreeByClassNameWithImplicitWait {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Set an implicit wait of 10 seconds
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME03);

            // Locate the element by its class name
            WebElement element = driver.findElement(By.className("element_class"));

            // Check if the element is an image
            if (element.getTagName().equals("img")) {
                // Get the src attribute for img tags
                String src = element.getAttribute("src");
                System.out.println("Image source: " + src);
            } else {
                // Get the text content for other tags
                String content = element.getText();
                System.out.println("Element content: " + content);
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
