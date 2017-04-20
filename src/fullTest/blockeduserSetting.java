package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class blockeduserSetting {
	WebDriver wd;
	
	public blockeduserSetting(WebDriver wd){
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
	
	public void clickBlockedUsers(){
		System.out.println("Klik Blocked Users");
		wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='3']")).click();
	}
	
	public void backtoSetting(){
		System.out.println("Back To Setting");
		wd.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
	}
}
