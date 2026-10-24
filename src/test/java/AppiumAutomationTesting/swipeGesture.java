package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class swipeGesture {
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity("io.appium.android.apis.ApiDemos");
		URL url=URI.create("http://127.0.0.1:4723").toURL();
		AppiumDriver driver=new AndroidDriver(url,options);
		WebElement element=driver.findElement(AppiumBy.accessibilityId("Views"));
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)element).getId()
		));
		WebElement element1=driver.findElement(AppiumBy.id("android:id/list"));
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)element1).getId(),
				"direction", "up",
				"percent", 0.20
		));                                                                                        
		System.out.println("Completed");
	}
}
