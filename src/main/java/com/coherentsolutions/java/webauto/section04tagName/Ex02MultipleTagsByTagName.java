package com.coherentsolutions.java.webauto.section04tagName;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME04;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to locate multiple types of elements by their tag names in the DOM Tree using Selenium WebDriver.
 */
public class Ex02MultipleTagsByTagName {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME04);

            // Locate elements by their tag name
            List<WebElement> links = driver.findElements(By.tagName("a"));
            List<WebElement> buttons = driver.findElements(By.tagName("button"));
            List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
            List<WebElement> spans = driver.findElements(By.tagName("span"));

            // Print out the text of each found element
            for (WebElement link : links) {
                System.out.println("Link text: " + link.getText());
            }
            for (WebElement button : buttons) {
                System.out.println("Button text: " + button.getText());
            }
            for (WebElement paragraph : paragraphs) {
                System.out.println("Paragraph text: " + paragraph.getText());
            }
            for (WebElement span : spans) {
                System.out.println("Span text: " + span.getText());
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}