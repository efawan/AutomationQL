package fullTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginFacebook {
	WebDriver wd;
	
	public loginFacebook(WebDriver wd){
		this.wd = wd;
		
	}
	public void selectLoginFacebook(){
		System.out.println("Klik Button Login Facebook");
		wd.findElement(By.id("org.qluein.android:id/btnFbLogin")).click();
		
		if(hasRecentLogin()){
			clickRecentAccount();
		}
		else if(areNotLogged()){
			loginFacebookAccount();
		}
		else if(facebookWebLogin()){
			hasnotFacebookApp();
		}
		else
		{
			System.out.println("Ada aplikasi Facebook dan sudah login");
		}
		System.out.println("Login Facebook berhasil dilakukan");
	}
	
	private boolean hasRecentLogin(){
		try{
			return wd.findElement(By.id("com.facebook.katana:id/dbl_fragment_layout")) != null;
		}
		catch(Exception e){
			return false;
		}
	}
	
	private void clickRecentAccount(){
		System.out.println("Device ada aplikasi Facebook dan pernah login");
		wd.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
		
		System.out.println("Masukkan password");
		wd.findElement(By.id("com.facebook.katana:id/password")).sendKeys("qluecoba_new");
		
		System.out.println("Klik login");
		wd.findElement(By.id("com.facebook.katana:id/login_signin")).click();
	}
	
	private boolean areNotLogged(){
		try {
			return wd.findElement(By.id("com.facebook.katana:id/login_root")) != null;
		} catch (Exception e) {
			return false;
		}
	}
	
	private void loginFacebookAccount(){
		System.out.println("Device ada aplikasi Facebook dan belum pernah login");
		wd.findElement(By.id("com.facebook.katana:id/login_username")).clear();
		
		System.out.println("Masukkan email");
		wd.findElement(By.id("com.facebook.katana:id/login_username")).sendKeys("qluecobanew@gmail.com");
		
		System.out.println("Masukkan password");
		wd.findElement(By.id("com.facebook.katana:id/login_password")).sendKeys("qluecoba_new");
			
		System.out.println("Klik login");
		wd.findElement(By.id("com.facebook.katana:id/login_login")).click();
	}
	
	private boolean facebookWebLogin(){
		try {
			return wd.findElement(By.xpath("//android.webkit.WebView[@index='0']")) != null;
		} catch (Exception e) {
			return false;
		}
	}
	
	private void hasnotFacebookApp(){
		System.out.println("Device tidak ada aplikasi Facebook");
		
		System.out.println("Isi Username dan Password");
		List<WebElement>a=wd.findElements(By.className("android.widget.EditText"));
		a.get(0).sendKeys("qluecobanew@gmail.com");
		a.get(1).sendKeys("qluecoba_new");
		
		System.out.println("Klik login");
		wd.findElement(By.className("android.widget.Button")).click();
		
		System.out.println("Klik OK");
		for(int i=1; i<3; i++){
			wd.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'u_0_1')]")).click();
		}
	}
}
