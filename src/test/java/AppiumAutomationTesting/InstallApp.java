package AppiumAutomationTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class InstallApp {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
		URL url=URI.create("http://127.0.0.1:4723").toURL();
		AppiumDriver driver=new AndroidDriver(url,options);
		String appurl=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"ApiDemos-debug.apk";
	    ((AndroidDriver)driver).installApp(appurl);
	    ((AndroidDriver)driver).activateApp("io.appium.android.apis");
		System.out.println(((AndroidDriver)driver).isAppInstalled("io.appium.android.apis"));
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(5));
		System.out.println("Successful");
	}
}
