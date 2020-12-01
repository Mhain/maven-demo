package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mavenTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Firfox
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	
		WebElement Email=driver.findElement(By.id("input-email"));
		WebElement Password=driver.findElement(By.id("input-password"));
		WebElement LoginBtn=driver.findElement(By.cssSelector(" #content > div > div:nth-child(2) > div > form > input"));		

	//login
			Email.clear();
			Email.sendKeys("mhain1995@gmail.com");
			Password.clear();
			Password.sendKeys("123456asdf");
		LoginBtn.click();
	
	}
}
