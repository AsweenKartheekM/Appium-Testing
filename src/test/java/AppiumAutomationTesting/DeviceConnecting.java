package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DeviceConnecting {
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
	    options.setAppPackage("io.appium.android.apis");
	    options.setAppActivity("io.appium.android.apis.ApiDemos");
	    URL url = URI.create("http://127.0.0.1:4723").toURL();
	    AppiumDriver driver=new AndroidDriver(url,options);
	    WebElement e1=driver.findElement(AppiumBy.accessibilityId("Accessibility"));
	    System.out.println(e1.getText());
	    String e2=driver.findElements(AppiumBy.id("android:id/text1")).get(1).getText();
	    System.out.println(e2);
	    String e3=driver.findElements(AppiumBy.className("android.widget.TextView")).get(2).getText();
	    System.out.println(e3);
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]")).getText();
	    System.out.println(driver.findElement(AppiumBy.xpath("//*[@text='Accessibility']")).getText());
	    System.out.println(driver.findElement(AppiumBy.name("Accessibility")).getText()); // this locator does not work in android
	}
}
