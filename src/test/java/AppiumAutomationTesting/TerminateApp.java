package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.appmanagement.ApplicationState;

public class TerminateApp {
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
	    options.setAppPackage("io.appium.android.apis");  
	    options.setAppActivity("io.appium.android.apis.ApiDemos");
	    URL url = URI.create("http://127.0.0.1:4723").toURL();
	    AppiumDriver driver=new AndroidDriver(url,options);
	    driver.findElement(AppiumBy.accessibilityId("Views")).click();
	    ((AndroidDriver) driver).terminateApp("io.appium.android.apis");
	    ApplicationState state=((AndroidDriver) driver).queryAppState("io.appium.android.apis");
	    System.out.println(state);
	}
}
