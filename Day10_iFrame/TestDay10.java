package com.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDay10 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement frame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frame);
        System.out.println("Title of the page is: " + driver.getTitle());
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Hello, Ali");
        try {
            Thread.sleep(2000); // Wait for 2 seconds to see the result
        } 
        catch (InterruptedException e) {
            e.getMessage();
        }
        driver.switchTo().defaultContent();
        System.out.println("Title of the page is: " + driver.getTitle());
        driver.quit();
       
    }
}
