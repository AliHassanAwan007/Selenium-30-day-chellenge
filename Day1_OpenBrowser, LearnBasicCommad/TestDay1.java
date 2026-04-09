package com.example.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDay1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

    try {
        Thread.sleep(5000); 
    }       
    catch (InterruptedException e) {
    System.out.println("Thread was interrupted: " + e.getMessage());
    }
    System.out.println("Page Title: " + driver.getTitle());
        driver.quit();
    }
}