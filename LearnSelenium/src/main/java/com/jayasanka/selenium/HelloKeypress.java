package com.jayasanka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloKeypress {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("test message");
        
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();

	}

}
