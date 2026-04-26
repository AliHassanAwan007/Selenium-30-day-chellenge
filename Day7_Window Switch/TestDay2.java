package com.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestDay2 {
    public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/login");
    driver.findElement(By.id("login"));
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.className("radius")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.getMessage();
    }

    if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/secure")) {
    System.out.println("Login successful!");
   } else {
    System.out.println("Login failed!");
   }
    
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.getMessage();
    }
    
    System.out.println("Page Title: " + driver.getTitle());
   driver.quit();
    }

}