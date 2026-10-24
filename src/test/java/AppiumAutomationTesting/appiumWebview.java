package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class appiumWebview {
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
		WebElement element=driver.findElement(AppiumBy.id("android:id/list"));
		boolean canscrollMore=true;
		while(canscrollMore) {
			canscrollMore=(Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
															"elementId", ((RemoteWebElement)element).getId(),
															"direction", "down",
															"percent", 0.50
														));
		}
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='WebView2']")).click();
	    Set<String> contexts=((AndroidDriver)driver).getContextHandles();
	    for(String context:contexts) {
	    	System.out.println(context);
	    }
	    for(String context:contexts) {
	    	if(context.contains("WEBVIEW")) {
	    		((AndroidDriver)driver).context(context);
	    		break;
	    	}
	    }
	    System.out.println(((AndroidDriver)driver).getContext());
	    Thread.sleep(3000);
		String value = driver.findElement(By.xpath("//*[contains(text(),'Second Selenium sandbox')]")).getText();
		System.out.println(value);
	}
}
