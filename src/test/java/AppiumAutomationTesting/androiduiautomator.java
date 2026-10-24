package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class androiduiautomator {
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("RZCT40WK0VR");
	    options.setAppPackage("io.appium.android.apis");
	    options.setAppActivity("io.appium.android.apis.ApiDemos");
	    URL url = URI.create("http://127.0.0.1:4723").toURL();
	    AppiumDriver driver=new AndroidDriver(url,options);
	    System.out.println(driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")")).getText());
	    WebElement element=driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).get(1);
	    System.out.println(element.getText());
	    String element1=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Accessibility\")")).getText();
	    System.out.println(element1);
	    System.out.println(driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")")).get(2).getText());
	}
}
