package com.example.Pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDay6 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByIndex(1);
        String selectedOption = select.getFirstSelectedOption().getText();
        System.out.println("Selected option is "+selectedOption);
        select.selectByVisibleText("Option 2");
        selectedOption = select.getFirstSelectedOption().getText();
        System.out.println("Selected option is "+selectedOption);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.getMessage();

        }
        driver.quit();
    
    }
    
}
