package testFramework;

public class main {
	
	public static void main(String[] args) {
	    // Firefox tests
		System.out.println("Beginning functional test on Firefox");
	    FirefoxBrowser firefox = new FirefoxBrowser();
	    firefox.loginTest();
	    firefox.saveRecipeTest();
	    firefox.logoutTest();
	    firefox.quit();
	    firefox.summarise();
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
