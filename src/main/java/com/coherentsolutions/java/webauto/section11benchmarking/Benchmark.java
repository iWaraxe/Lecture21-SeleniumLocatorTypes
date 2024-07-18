package com.coherentsolutions.java.webauto.section11benchmarking;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.coherentsolutions.java.webauto.Main.*;

public class Benchmark {

    private static final int NUM_RUNS = 10; // Number of runs for averaging

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        long totalCssTime = 0;
        long totalXpathTime = 0;
        long startTime = 0;
        long endTime = 0;
        long xpathTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            WebDriver driver = new ChromeDriver();
            try {
                // Load the page once
                driver.get(FILE_NAME_STARTER + FILE_NAME11);

                // Benchmark XPath
                XPathBenchmark.findAllElementsUsingXPath(driver);

                // Reload the page to reset the state
                driver.get(FILE_NAME_STARTER + FILE_NAME11);

                // Benchmark CSS Selectors
                startTime = System.currentTimeMillis();
                CSSSelectorsBenchmark.findAllElementsUsingCSS(driver);
                endTime = System.currentTimeMillis();
                long cssTime = endTime - startTime;
                totalCssTime += cssTime;
                System.out.println("Run " + (i + 1) + " - CSS Selectors Time: " + cssTime + " ms");

                // Reload the page to reset the state
                driver.get(FILE_NAME_STARTER + FILE_NAME11);

                // Benchmark XPath
                startTime = System.currentTimeMillis();
                XPathBenchmark.findAllElementsUsingXPath(driver);
                endTime = System.currentTimeMillis();
                xpathTime = endTime - startTime;
                totalXpathTime += xpathTime;
                System.out.println("Run " + (i + 1) + " - XPath Time: " + xpathTime + " ms");

            } finally {
                driver.quit();
            }
        }

        // Calculate averages
        long averageCssTime = totalCssTime / NUM_RUNS;
        long averageXpathTime = totalXpathTime / NUM_RUNS;

        System.out.println("Average XPath Time: " + averageXpathTime + " ms");
        System.out.println("Average CSS Selectors Time: " + averageCssTime + " ms");
    }
}
