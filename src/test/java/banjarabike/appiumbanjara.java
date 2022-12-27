package banjarabike;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class appiumbanjara {
AndroidDriver<AndroidElement> driver;
@BeforeTest
public void bt() throws MalformedURLException
{
	DesiredCapabilities dc =new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5544");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.forbinary.banjararide");
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.forbinary.banjararide.activity.SplashActivity");
   driver = new	AndroidDriver<AndroidElement>(new URL("http://0.0.0:4723/wd/hub"),dc);
}
@Test
public void t() throws InterruptedException {
	Thread.sleep(3000);
	//driver.findElement(MobileBy.AccessibilityId("ENGLISH")).click();
	
	driver.findElement(MobileBy.AccessibilityId("BOOK NOW")).click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AccessibilityId("Hire Bike")).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CB Hornet 160R\"))").click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"7 days\"))").click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AccessibilityId("BOOK NOW")).click();
	driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
	Thread.sleep(3000);
	TouchAction ta = new TouchAction(driver);
	ta.longPress(PointOption.point(831,1085)).moveTo(PointOption.point(195,1095)).release().perform();
	driver.findElement(MobileBy.AccessibilityId("01 January 2023")).click();
	driver.findElement(MobileBy.id("android:id/button1"));
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.findElement(MobileBy.AccessibilityId("Open")).click();
	driver.findElement(MobileBy.AccessibilityId("Bookings")).click();
	driver.findElement(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‎‏‎‏‎‏‏‎‎‏‎‏‏‏‎‏‎‎‏‎‏‎‎‏‎‎‎‏‏‎‏‎‏‎‏‎‏‎‎‎‏‎‏‎‎‎‎‎‎‏‎‏‏‎‎‎‏‎‏‎Search‎")).click();
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("activa");
	driver.findElement(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‎‏‎‏‎‏‏‎‎‏‎‏‏‏‎‏‎‎‏‎‏‎‎‏‎‎‎‏‏‎‏‎‏‎‏‎‏‎‎‎‏‎‏‎‎‎‎‎‎‏‎‏‏‎‎‎‏‎‏‎‎Clear query‎")).click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))").click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
}		
}		