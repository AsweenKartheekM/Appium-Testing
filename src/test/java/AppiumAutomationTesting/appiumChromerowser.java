package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class appiumChromerowser {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
		options.setCapability("browserName", "Chrome");
		URL url=URI.create("http://127.0.0.1:4723").toURL();
		AppiumDriver driver=new AndroidDriver(url,options);
		Thread.sleep(8000);
		driver.get("https://testautomationpractice.blogspot.com/");
	}
}
