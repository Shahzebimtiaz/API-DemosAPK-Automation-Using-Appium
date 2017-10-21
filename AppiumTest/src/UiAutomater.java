import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class UiAutomater extends base {

	public static void main(String[] args) throws MalformedURLException{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Graphics']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Arcs\")").click();
		System.out.print(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}
	
}

