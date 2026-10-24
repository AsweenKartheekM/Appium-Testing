package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;

//import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class swipeGesture2 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity("io.appium.android.apis.ApiDemos");
		URL url=URI.create("http://127.0.0.1:4723").toURL();
		AppiumDriver driver=new AndroidDriver(url,options);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
/*		WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]"));
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)element).getId(),
				"direction", "left",
				"percent", "0.10"                     
		));                                                                                                */
		Thread.sleep(6000);
		List<WebElement> photos=driver.findElements(AppiumBy.xpath("//android.widget.Gallery[@resource-id='io.appium.android.apis:id/gallery']/android.widget.ImageView"));
		System.out.println("The number of photos: "+photos.size());
	}
}
