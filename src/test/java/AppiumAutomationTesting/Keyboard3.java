package AppiumAutomationTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Keyboard3 {
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
	    driver.findElement(AppiumBy.accessibilityId("Views")).click();
	    WebElement element = driver.findElement(AppiumBy.id("android:id/list"));
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", "up",
                "percent", 0.75
        ));
	    driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='hint text']")).click();
	    System.out.println(((AndroidDriver)driver).isKeyboardShown());
	    ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.A));
	    ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.B));
	    ((AndroidDriver)driver).hideKeyboard();
	    driver.quit();
	}
}
