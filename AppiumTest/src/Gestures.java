import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;


public class Gestures extends base {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException{
		AndroidDriver<AndroidElement> driver = Capabilities();
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height*0.80);
		int endy = (int)(height*0.20);
		driver.swipe(x, starty, x, endy, 500);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		TouchAction ta = new TouchAction(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ta.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ta.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(3000).release().perform();
		System.out.println(driver.findElementById("android:id/alertTitle").getText());
	}
	

}
