package com.coherentsolutions.java.webauto.section10xPaths;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.FILE_NAME10;
import static com.coherentsolutions.java.webauto.Main.FILE_NAME_STARTER;

public class Ex11MultipleCriteriaOr {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get(FILE_NAME_STARTER + FILE_NAME10);
            WebElement element = driver.findElement(By.xpath("//div[@id or @class]"));
            System.out.println("Element found: " + element.getText());
        } finally {
            driver.quit();
        }
    }
}
