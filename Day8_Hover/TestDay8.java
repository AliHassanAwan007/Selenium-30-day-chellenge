package com.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestDay8 {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        WebElement firstImage = driver.findElement(By.xpath("//div[@class='figure'][1]"));
        actions.moveToElement(firstImage).perform();
        WebElement name = driver.findElement(By.tagName("h5"));
        System.out.println("Name: " + name.getText());
         try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();

        }
         WebElement SecondImage = driver.findElement(By.xpath("//div[@class='figure'][2]//h5"));
        actions.moveToElement(SecondImage).perform();
        WebElement name2 = driver.findElement(By.xpath("(//div[@class='figure'])[2]//h5"));
        System.out.println("Name: " + name2.getText());
         try {  
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();

        }
         WebElement Thirdimage = driver.findElement(By.xpath("//div[@class='figure'][3]"));
        actions.moveToElement(Thirdimage).perform();
        WebElement name3 = driver.findElement(By.xpath("(//div[@class='figure'])[3]//h5"));
        System.out.println("Name: " + name3.getText());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();

        }
        driver.quit();
    }
    
}
