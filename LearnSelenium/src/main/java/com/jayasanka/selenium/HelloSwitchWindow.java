package com.jayasanka.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        
        WebElement newTabBtn = driver.findElement(By.id("new-tab-button"));
        newTabBtn.click();
        
        String originalHandler = driver.getWindowHandle();
        
        for (String windowHandler : driver.getWindowHandles()) {
        	driver.switchTo().window(windowHandler);
        }
        
        driver.switchTo().window(originalHandler);
        
        driver.quit();

	}

}
