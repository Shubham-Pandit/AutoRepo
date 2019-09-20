package com.AutoIt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt_Exercise1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "geckodriver64bit.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("D:\\Software\\New folder\\Selenium Software\\Offline Website\\Program1.html");
		driver.findElement(By.xpath("/html/body/input[1]")).click();

		Runtime.getRuntime().exec("C:\\Users\\shubham\\Documents\\new.exe");
		System.out.println("File Successfully uploaded...");
		
		driver.findElement(By.xpath("/html/body/input[2]")).click();


	}

}
