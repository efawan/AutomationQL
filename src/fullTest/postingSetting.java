package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class postingSetting {
	WebDriver wd;
	
	public  postingSetting(WebDriver wd){
		this.wd = wd;
		
	}
	
	public void clickMore(){
		System.out.println("Klik Button More");
		wd.findElement(By.xpath("//android.widget.ImageButton[@index='4']")).click();
		
	}
	
	public void clickSetting(){
		System.out.println("Klik Button Setting");
		wd.findElement(By.id("org.qluein.android:id/linearSettings")).click();
	}
	
	public void clickPosting(){
		System.out.println("Klik Button Posting");
		wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='1']")).click();
	}
	
	public void clickSaveImage(){
		System.out.println("Klik Button Svae Image");
		wd.findElement(By.id("org.qluein.android:id/switchView")).click();
	}
	
	public void backtoSetting(){
		System.out.println("Back To Setting");
		wd.findElement(By.className("android.widget.ImageButton")).click();
	}
	
}
