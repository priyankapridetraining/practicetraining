package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		System.out.println("Login is successful");
		
		//verify title
		String ActualTitle = driver.findElement(By.xpath("//a[@id=\"item_4_title_link\"]")).getText();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Sauce Labs Backpack";
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("The title is verified");
		}
		else
		{
			System.out.println("The title is not verified");
		}
		
		//Verify page title
		String pageTitle = driver.getTitle();
		//Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("SwagLabs");
		//assertTrue(verifyTitle);
		//Assert.assertEquals(pageTitle,"Priya");
		System.out.println(pageTitle);
		
		//verify price
		String ActualPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price'][1]")).getText();
		System.out.println(ActualPrice);
		String ExpectedPrice = "$29.99";
		if(ActualPrice.equals(ExpectedPrice)) {
			System.out.println("The price is verified");
		}
		else {
			System.out.println("The price is not verified");
		}
		
		
		//Verify add to cart button
		boolean AddToCart = ! driver.findElements(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).isEmpty();
		if (AddToCart) {
			System.out.println("Add to cart button for sauce labs backpack is present. ");
		
		}
		
		else {
			System.out.println("Add to cart button for sauce labs backpack is not present.");
			
		}
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		
		//verify Remove button
		
		boolean Remove = ! driver.findElements(By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]")).isEmpty();
		if (Remove) {
			System.out.println("Remove button for sauce labs backpack is present. ");
		
		}
		
		else {
			System.out.println("Remove button for sauce labs backpack is not present.");
			
		}
		driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]")).click();
		
		
		//Verify sorting
		

		driver.findElement(By.className("product_sort_container")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value=\"az\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("product_sort_container")).click();
		driver.findElement(By.xpath("//option[@value=\"za\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("product_sort_container")).click();
		driver.findElement(By.xpath("//option[@value=\"lohi\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("product_sort_container")).click();
		driver.findElement(By.xpath("//option[@value=\"hilo\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		Thread.sleep(2000);
	
		
		driver.close();
	}

	//private static void assertTrue(Boolean verifyTitle) {
		// TODO Auto-generated method stub
		
	}
	
	
//}



