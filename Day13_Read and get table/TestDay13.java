package com.example.Pages;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestDay13 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table = driver.findElement(By.id("table1"));
        System.out.println(table.getText());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("Total rows: " + rows.size());
        for(WebElement row : rows){
        System.out.println(row.getText());
        }

        WebElement cell = driver.findElement( By.xpath("//table[@id='table1']/tbody/tr[1]/td[2]"));
        System.out.println(cell.getText());
        
        String targetEmail = "jsmith@gmail.com";
        // 2. Traditional loop: Start at 0, go until the end of the list size
        for (int i = 0; i < rows.size(); i++) {
         // Get the specific row based on the current index 'i'
         String rowText = rows.get(i).getText();
        // 3. Check if the email exists in this specific row
        if (rowText.contains(targetEmail)) {
        // We add +1 to 'i' because row index starts at 0, but tables start at 1
        System.out.println("Match found at Row Number: " + (i + 1));
         // Stop the loop once found
        break; 
         }
        }
        driver.quit();}
}
