import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


public class chromeBase {

	/**
	 * @param args
	 */
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo A2016a40");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
        return driver;
	}

}
