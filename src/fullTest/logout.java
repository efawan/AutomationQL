package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout {
	WebDriver wd;
	
	public logout(WebDriver wd){
		this.wd = wd;
	}
	
	public void clickMore(){
		System.out.println("Klik more button");
		wd.findElement(By.xpath("//android.widget.ImageButton[@index='4']")).click();
	}
	
	public void clickSettingsButton(){
		System.out.println("Klik Settings Button");
		wd.findElement(By.id("org.qluein.android:id/linearSettings")).click();
	}
	
	public void clickLogout(){
		System.out.println("Klik Logout Button");
		wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='7']")).click();
	}
}
