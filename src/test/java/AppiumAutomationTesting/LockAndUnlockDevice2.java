package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LockAndUnlockDevice2 {
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
	    options.setAppPackage("io.appium.android.apis");
	    options.setAppActivity("io.appium.android.apis.ApiDemos");
	    options.setUnlockType("pin");
	    options.setUnlockKey("250304");
	    URL url = URI.create("http://127.0.0.1:4723").toURL();
	    AppiumDriver driver=new AndroidDriver(url,options);
	    ((AndroidDriver)driver).lockDevice(Duration.ofSeconds(5));
	    System.out.println(((AndroidDriver)driver).isDeviceLocked());
	}
}
