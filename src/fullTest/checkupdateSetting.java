package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkupdateSetting {
	WebDriver wd;
	
	public checkupdateSetting(WebDriver wd){
		this.wd=wd;
		
	}
	
	public void clickMore(){
		System.out.println("Klik More Button");
		wd.findElement(By.xpath("//android.widget.ImageButton[@index='4']")).click();
	}
	
	
	public void clickSetting(){
		System.out.println("Klik Setting Button");
		wd.findElement(By.id("org.qluein.android:id/linearSettings")).click();
	}
	
	public void clickCheckUpdateSetting(){
		System.out.println("Klik Check For Update Button");
		wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='4']")).click();
	}
	
	public void clickOk(){
		System.out.println("Klik Button OK");
		wd.findElement(By.id("android:id/button1")).click();
	}
	
}

