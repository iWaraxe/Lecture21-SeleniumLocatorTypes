package com.coherentsolutions.java.webauto.section11benchmarking;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME11;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

public class CSSSelectorsBenchmark {

    public static void findAllElementsUsingCSS(WebDriver driver) {
        // Find elements by different CSS Selectors
        List<WebElement> elements;

        // Find all elements
        elements = driver.findElements(By.cssSelector("*"));
        printElements("All elements", elements);

        // Find element by ID
        elements = driver.findElements(By.cssSelector("#header"));
        printElements("Element by ID", elements);

        // Find elements by class name
        elements = driver.findElements(By.cssSelector(".abc"));
        printElements("Elements by Class Name", elements);

        // Find elements by tag name
        elements = driver.findElements(By.cssSelector("div"));
        printElements("Elements by Tag Name", elements);

        // Find elements by attribute name
        elements = driver.findElements(By.cssSelector("[class]"));
        printElements("Elements by Attribute Name", elements);

        // Find elements by attribute value
        elements = driver.findElements(By.cssSelector("[class='abc']"));
        printElements("Elements by Attribute Value", elements);

        // Find elements by partial attribute value
        elements = driver.findElements(By.cssSelector("[class*='cont']"));
        printElements("Elements by Partial Attribute Value", elements);

        // Find elements by start of attribute value
        elements = driver.findElements(By.cssSelector("[class^='abc']"));
        printElements("Elements by Start of Attribute Value", elements);

        // Find elements by end of attribute value
        elements = driver.findElements(By.cssSelector("[class$='content']"));
        printElements("Elements by End of Attribute Value", elements);

        // Find child elements at any level
        elements = driver.findElements(By.cssSelector("div .nested-content"));
        printElements("Child Elements at Any Level", elements);

        // Find immediate child elements
        elements = driver.findElements(By.cssSelector("div > .nested-content"));
        printElements("Immediate Child Elements", elements);

        // Find adjacent sibling elements
        elements = driver.findElements(By.cssSelector(".link + .link"));
        printElements("Adjacent Sibling Elements", elements);

        // Find all following sibling elements
        elements = driver.findElements(By.cssSelector(".link ~ .link"));
        printElements("Following Sibling Elements", elements);
    }

    private static void printElements(String label, List<WebElement> elements) {
        System.out.println(label + ": " + elements.size());
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(FILE_NAME_STARTER + FILE_NAME11);
            findAllElementsUsingCSS(driver);
        } finally {
            driver.quit();
        }
    }
}
