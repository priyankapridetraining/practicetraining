package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;

public class testcases {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Browser Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		String ActualTitle = driver.findElement(By.className("app_logo")).getText();
		if(ActualTitle.equals("Swag Labs")){
			System.out.println("Login Is Successfull");
		}
		else {
			System.out.println("Login is Failed");
		}
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("about_sidebar_link")).click();
WebElement elementToHover = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));

        // Create an instance of Actions class
        Actions actions = new Actions(driver);

        // Perform hover over the element
        actions.moveToElement(elementToHover).perform();
        String Products = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span")).getText();
        //System.out.println(Products);
        if(Products.equals("Platform for Test")){
			System.out.println("Products are displayed");
		}
		else {
			System.out.println("Products are not displayed");
		}
}
}