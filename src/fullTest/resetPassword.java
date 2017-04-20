package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class resetPassword {
	WebDriver wd;
	
	public resetPassword(WebDriver wd){
		this.wd = wd;
	}
	
	public void selectLoginManual(){
		System.out.println("Klik Button Login Manual");
		wd.findElement(By.id("org.qluein.android:id/btnQlue")).click();
	}
	
	public void selectResetPassword(){
		System.out.println("Klik Button Reset Password");
		wd.findElement(By.id("org.qluein.android:id/txtCaption")).click();
	}
	
	public void selectEmail(){
		System.out.println("Klik Button Email");
		wd.findElement(By.id("org.qluein.android:id/username_input")).click();
	}
	
	public void fillEmail(){
		System.out.println("isiEmail");
		wd.findElement(By.id("org.qluein.android:id/username_input")).sendKeys("qluecoba4@gmail.com");
	}
	
	public void selectOk1(){
		System.out.println("Klik Button OK");
		wd.findElement(By.id("org.qluein.android:id/btnPost")).click();
	}
	
	public void selectOk(){
		System.out.println("Klik Button OK");
		wd.findElement(By.id("android:id/button1")).click();
	}
	
}
