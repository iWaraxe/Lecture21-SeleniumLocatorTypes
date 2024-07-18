package com.coherentsolutions.java.webauto.section03className;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME03;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

/**
 * This class demonstrates how to locate multiple elements by their class name in the DOM Tree using Selenium WebDriver.
 */
public class Ex02MultipleElementsByClassName {

    public static void main(String[] args) {
        // Set up the WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the local HTML file
            driver.get(FILE_NAME_STARTER + FILE_NAME03);

            // Locate multiple elements by their class name
            List<WebElement> elements = driver.findElements(By.className("element_class"));

            // Iterate over the elements and print their text or attributes
            for (WebElement element : elements) {
                if (element.getTagName().equals("img")) {
                    System.out.println("Image source: " + element.getAttribute("src"));
                } else if (element.getTagName().equals("div")) {
                    System.out.println("Div content: " + element.getText());
                }
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}