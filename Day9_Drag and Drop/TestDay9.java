package com.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDay9 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(source, target).perform();
        String sourceText = source.getText();
        String targetText = target.getText();
        if (sourceText.equals("B") && targetText.equals("A")) {
            System.out.println("Drag and drop successful!");
        } else {
            System.out.println("Drag and drop failed.");
        }
        try {
            Thread.sleep(2000); // Wait for 2 seconds to see the result
        } 
        catch (InterruptedException e) {
            e.getMessage();
        }
        driver.quit();
       
    }
    
}
