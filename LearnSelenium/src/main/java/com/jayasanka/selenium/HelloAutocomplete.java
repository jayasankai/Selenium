package com.jayasanka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloAutocomplete {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("test message");
        
        Thread.sleep(1000);
        
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();

	}

}
