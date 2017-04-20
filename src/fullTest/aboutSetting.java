package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.touch.TouchActions;


public class aboutSetting {
	WebDriver wd;
	
	public aboutSetting(WebDriver wd){
		this.wd = wd;
	}
	
	public void clickMore(){
		System.out.println("Klik More Button");
		wd.findElement(By.xpath("//android.widget.ImageButton[@index='4']")).click();
	}
	
	public void clickSettingButton(){
		System.out.println("Klik Setting Button");
		wd.findElement(By.id("org.qluein.android:id/linearSettings")).click();
	}
	
	public void clickAbout(){
		System.out.println("Klik About Button");
		wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='6']")).click();
	}
	
	//Work In Progress
	/*public void scrollAbout(){
		System.out.println("Scroll About");
		WebElement slider = wd.findElement(By.xpath("//android.webkit.WebView[@index='0']/android.webkit.WebView[@index='0']"));
		
		TouchActions touch = new TouchActions(wd);
		touch.scroll(slider, 350, 500);
	}*/
	
	public void backtoSetting(){
		System.out.println("Back To Setting");
		wd.navigate().back();
		
	}
}

