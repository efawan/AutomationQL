package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginGoogle {
	WebDriver wd;
	
	public loginGoogle (WebDriver wd) {
		this.wd = wd;	
	}
	
	public void selectloginGoogle() {
		System.out.println("Klik Button Google");
		wd.findElement(By.id("org.qluein.android:id/btnPlusLogin")).click();
	}
	
	public void selectEmail() {
		if(moreAccount()){
			System.out.println("Klik Email");
			wd.findElement(By.id("com.google.android.gms:id/account_display_name")).click();
		}
		System.out.println("Login Berhasil dan Masuk ke Tutorial");
	}
	
	private boolean moreAccount(){
		try {
			return wd.findElement(By.id("com.google.android.gms:id/account_display_name")) != null;
		} catch (Exception e) {
			return false;
		}
	}
}
