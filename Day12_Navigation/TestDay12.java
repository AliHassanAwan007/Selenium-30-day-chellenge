package com.example.Pages;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestDay12 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.wikipedia.org");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println("Current URL: " + driver.getTitle());
        driver.quit();
    }
    
}