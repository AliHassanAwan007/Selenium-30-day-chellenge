package com.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDay3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
      
        System.out.println("Tittle is:"+driver.getTitle());
        if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/secure")) {
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login failed");
        }
          try {
            Thread.sleep(5000);
             driver.quit();
        } catch (InterruptedException e) {
            e.getMessage();
        }
       
    }
}