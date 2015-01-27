package testFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxProfile;

public class main {
	
	public static void main(String[] args) {
	    // Firefox tests
	    FirefoxBrowser firefox = new FirefoxBrowser();
	    firefox.loginTest();
	    //firefox.quit();
	}
	/*
	public static FirefoxProfile getProfile() {
		// Attaching blockSite extension to Firefox
	    String blockSiteExtensionPath = "C:\\Users\\Jiajun\\workspace\\LDC\\extensions\\blocksite-1.1.8-fx.xpi";
	    FirefoxProfile profile = new FirefoxProfile();
	    
	    try {
	        profile.addExtension(new File(blockSiteExtensionPath));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    return profile;
	}*/
}
