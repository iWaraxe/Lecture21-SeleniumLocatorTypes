package com.coherentsolutions.java.webauto.section11benchmarking;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME11;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

public class XPathBenchmark {

    public static void findAllElementsUsingXPath(WebDriver driver) {
        // Find elements by different XPaths
        List<WebElement> elements;

        // Find all elements
        elements = driver.findElements(By.xpath("//*"));
        printElements("All elements", elements);

        // Find element by ID
        elements = driver.findElements(By.xpath("//*[@id='header']"));
        printElements("Element by ID", elements);

        // Find elements by class name
        elements = driver.findElements(By.xpath("//*[@class='abc']"));
        printElements("Elements by Class Name", elements);

        // Find elements by tag name
        elements = driver.findElements(By.xpath("//div"));
        printElements("Elements by Tag Name", elements);

        // Find elements by attribute name
        elements = driver.findElements(By.xpath("//*[@class]"));
        printElements("Elements by Attribute Name", elements);

        // Find elements by attribute value
        elements = driver.findElements(By.xpath("//*[@class='abc']"));
        printElements("Elements by Attribute Value", elements);

        // Find elements by partial attribute value
        elements = driver.findElements(By.xpath("//*[contains(@class, 'cont')]"));
        printElements("Elements by Partial Attribute Value", elements);

        // Find elements by start of attribute value
        elements = driver.findElements(By.xpath("//*[starts-with(@class, 'abc')]"));
        printElements("Elements by Start of Attribute Value", elements);

        // Find elements by end of attribute value
        elements = driver.findElements(By.xpath("//*[substring(@class, string-length(@class) - string-length('content') + 1) = 'content']"));
        printElements("Elements by End of Attribute Value", elements);

        // Find child elements at any level
        elements = driver.findElements(By.xpath("//div//div[@class='nested-content']"));
        printElements("Child Elements at Any Level", elements);

        // Find immediate child elements
        elements = driver.findElements(By.xpath("//div/div[@class='nested-content']"));
        printElements("Immediate Child Elements", elements);

        // Find adjacent sibling elements
        elements = driver.findElements(By.xpath("//a[@class='link']/following-sibling::*[1][self::a[@class='link']]"));
        printElements("Adjacent Sibling Elements", elements);

        // Find all following sibling elements
        elements = driver.findElements(By.xpath("//a[@class='link']/following-sibling::a[@class='link']"));
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
            findAllElementsUsingXPath(driver);
        } finally {
            driver.quit();
        }
    }
}
