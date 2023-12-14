package com.jayasanka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HelloScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        
        Actions actions = new Actions(driver);
        
        WebElement name = driver.findElement(By.id("name"));
        actions.moveToElement(name);
        name.sendKeys("test message");
        
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("10/10/2023");
        
        driver.quit();

	}

}
