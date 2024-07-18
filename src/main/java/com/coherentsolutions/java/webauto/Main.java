package com.coherentsolutions.java.webauto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String FILE_NAME_STARTER = "file:///Users/igorwaraxe/JAVA/JAVA/QA%20Auto%20(Java%20Web%20Automation)/Lectures/Lecture21/Lecture21-SeleniumLocatorTypes/src/main/resources/";
    public static final String FILE_NAME01 = "section01id.html";
    public static final String FILE_NAME02 = "section02name.html";
    public static final String FILE_NAME03 = "section03className.html";
    public static final String FILE_NAME04 = "section04tagName.html";
    public static final String FILE_NAME05 = "section05linkText.html";
    public static final String FILE_NAME06 = "section06partialLinkText.html";
    public static final String FILE_NAME07 = "section07cssSelector.html";
    public static final String FILE_NAME08 = "section08xpath.html";
    public static final String FILE_NAME09 = "section09cssSelectors.html";
    public static final String FILE_NAME10 = "section10xPaths.html";
    public static final String FILE_NAME11 = "section11benchmarking.html";


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}