package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class pinchopenGesture {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
		options.setAppPackage("com.google.android.apps.maps");
		options.setAppActivity("com.google.android.maps.MapsActivity");
		URL url=URI.create("http://127.0.0.1:4723").toURL();
		AppiumDriver driver=new AndroidDriver(url,options);
		Thread.sleep(6000);
		driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
				"left", 352,
				"top", 1011,
				"width", 332,
				"height", 299,
				"percent", 0.95
		));
		System.out.println("Completed");
	}
}
