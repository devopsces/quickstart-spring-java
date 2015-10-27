package com.wipro.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestClass {
	@Test
	public void testCaseHomepage() {

		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("http://localhost:8091/SpringAppQ");
		driver.get(System.getProperty("url"));

		driver.findElement(By.xpath("//input [@id='fname']")).sendKeys(
				"Spring");
		driver.findElement(By.xpath("//input [@id='lname']")).sendKeys(
				"Quickstarter");
		
		driver.findElement(By.xpath("//*[@id='submit']")).click();

		WebElement e1 = driver.findElement(By.xpath("//div [@id='user-data']"));

		String expectedName = "SPRING QUICKSTARTER";

		try {
			Assert.assertEquals(e1.getText(), expectedName);
		} finally {
			//driver.close();
			driver.quit();
		}
	}
}
