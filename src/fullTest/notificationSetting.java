package fullTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class notificationSetting {
	WebDriver wd;
	
	public notificationSetting(WebDriver wd){
		this.wd = wd;
		
	}
	
	public void clickMore(){
		System.out.println("Klik More Button");
		wd.findElement(By.xpath("//android.widget.ImageButton[@index='4']")).click();
	}
	
	public void clickSetting(){
		System.out.println("Klik Setting Button");
		wd.findElement(By.id("org.qluein.android:id/linearSettings")).click();
	}
	
	public void clickNotification(){
		System.out.println("Klik Notification");
		wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']")).click();
	}
	
	public void clickMention(){
		System.out.println("Klik Button On/Off Notif");
		List<WebElement>a=wd.findElements(By.className("android.widget.RelativeLayout"));
		a.get(1).click();
		a.get(2).click();
		a.get(3).click();
		a.get(4).click();
		a.get(0).click();
	}
	
	public void backtoSetting(){
		System.out.println("Klik Back To Setting");
		wd.findElement(By.className("android.widget.ImageButton")).click();
	}
	
}
