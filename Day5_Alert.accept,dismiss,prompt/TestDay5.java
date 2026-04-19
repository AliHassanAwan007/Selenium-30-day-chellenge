package com.example.Pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestDay5 {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); // click OK
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        System.out.println(alert.getText());
        alert.dismiss(); // click Cancel
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        System.out.println(alert.getText());
        alert.sendKeys("Hello, this is a prompt!");
        alert.accept(); // click OK
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("Title is:"+driver.getTitle());
        driver.quit();
    }
    
}
