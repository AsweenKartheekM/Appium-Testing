package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SendKeys {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
	    options.setAppPackage("io.appium.android.apis");  
	    options.setAppActivity("io.appium.android.apis.ApiDemos");
	    URL url = URI.create("http://127.0.0.1:4723").toURL();
	    AppiumDriver driver=new AndroidDriver(url,options);
	    By views=AppiumBy.accessibilityId("Views");
	    By textfields=AppiumBy.androidUIAutomator("new UiSelector().text(\"TextFields\")");
	    By edittext=AppiumBy.id("io.appium.android.apis:id/edit");
	    driver.findElement(views).click();
	    WebElement list=driver.findElement(AppiumBy.className("android.widget.ListView"));
	    driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
	    		"elementId", ((RemoteWebElement) list).getId(), 
	    		"direction", "up",
	    		"percent", "0.75"
	    )); 
	    driver.findElement(textfields).click();
	    driver.findElement(edittext).sendKeys("Asween Kartheek");
	    Thread.sleep(3000);
	    driver.findElement(edittext).clear();
	    driver.quit();
	    
	}
}
