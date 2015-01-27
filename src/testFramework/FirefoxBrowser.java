package testFramework;

import java.lang.System;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxBrowser extends FirefoxDriver {
	
	public FirefoxBrowser(){//FirefoxProfile profile) {
		//super(profile);
		
		// Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		this.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 
	public void loginTest() {
        
		// TODO Calculate load time
		
	    //Launch the Liquor.com Website
	    this.get("http://liquor.com");
	 
	    // Go through log in step 
	    this.findElement(By.className("ldc-user-login")).click();
	    this.findElement(By.id("login_username")).sendKeys("ghost5"); 
	    this.findElement(By.id("login_password")).sendKeys("ghostghost"); 
	    this.findElement(By.id("ldc-user-signin-button")).click();
	 
	    // Print a Log In message to the screen
	    System.out.println("Firefox login - Successful\n");
	 
	    // Find the element that's ID attribute is 'account_logout' (Log Out)
	    //this.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	} 
}
