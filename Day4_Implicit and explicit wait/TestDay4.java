package com.example.Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TestDay4 {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver drivers=new ChromeDriver();
        drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drivers.get("https://the-internet.herokuapp.com/login");
        
        WebDriverWait wait = new WebDriverWait(drivers, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("tomsmith");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("SuperSecretPassword!");
        wait.until(ExpectedConditions.elementToBeClickable(By.className("radius"))).click();    
        System.out.println("Title is:"+drivers.getTitle());


        if(drivers.getCurrentUrl().equals("https://the-internet.herokuapp.com/secure")) {
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login failed");
        }
        try {
            Thread.sleep(5000);
             drivers.quit();
        } 
        catch (InterruptedException e) {
            e.getMessage();
        }
    }   
}
