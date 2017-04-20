package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginManual {
	WebDriver wd;
	
	public loginManual(WebDriver wd){
		this.wd = wd;
	}
	
	public void selectLoginManual(){
		System.out.println("Klik Button Login Manual");
		wd.findElement(By.id("org.qluein.android:id/btnQlue")).click();
	}
	
	public void loginWithIncorrectUsername(){
		selectUsernameText();
		fillWithIncorrectUsername();
		selectPasswordText();
		fillPassword();
		clickNext();
	}
	
	public void loginWithIncorrectPassword(){
		selectUsernameText();
		fillUsername();
		selectPasswordText();
		fillWithIncorrectPassword();
		clickNext();
	}
	
	public void loginWithoutRegex(){
		selectUsernameText();
		fillUsernameWithoutRegex();
		selectPasswordText();
		fillPassword();
		clickNext();
	}
	
	public void loginWithRegex(){
		selectUsernameText();
		fillUsernameWithRegex();
		selectPasswordText();
		fillPassword();
		clickNext();
		statusLogin();
	}
	
	public void loginCorrected(){
		selectUsernameText();
		fillUsername();
		selectPasswordText();
		fillPassword();
		clickNext();
		statusLogin();
	}
	
	private void selectUsernameText(){
		System.out.println("");
		System.out.println("Pilih Teks Username");
		WebElement userText = wd.findElement(By.id("org.qluein.android:id/inpUsername"));
		userText.click();
		userText.clear();
	}
	
	private void fillWithIncorrectUsername(){
		System.out.println("Isi Username Salah");
		wd.findElement(By.id("org.qluein.android:id/inpUsername")).sendKeys("0qluecoba");		
	}
	
	private void fillUsernameWithoutRegex(){
		System.out.println("Isi Username tanpa Regex");
		wd.findElement(By.id("org.qluein.android:id/inpUsername")).sendKeys("qluecobanewgmail.com");		
	}
	
	private void fillUsernameWithRegex(){
		System.out.println("Isi Username dengan Regex");
		wd.findElement(By.id("org.qluein.android:id/inpUsername")).sendKeys("qluecobanew@gmail.com");		
	}
	
	private void fillUsername(){
		System.out.println("Isi Username Benar");
		wd.findElement(By.id("org.qluein.android:id/inpUsername")).sendKeys("qluecobanew");		
	}
	
	private void selectPasswordText(){
		System.out.println("Pilih Teks Password");
		WebElement passText = wd.findElement(By.id("org.qluein.android:id/inpPassword"));
		passText.click();
		passText.clear();
	}
	
	private void fillWithIncorrectPassword(){
		System.out.println("Isi Password Salah");
		wd.findElement(By.id("org.qluein.android:id/inpPassword")).sendKeys("qluecoba_wen");		
	}
	
	private void fillPassword(){
		System.out.println("Isi Password Benar");
		wd.findElement(By.id("org.qluein.android:id/inpPassword")).sendKeys("qluecoba_new");
	}
	
	private void clickNext(){
		System.out.println("Klik Next");
		wd.findElement(By.name("Next")).click();
	}
	
	private void statusLogin(){
		System.out.println("Login Berhasil dan Masuk ke Tutorial");
	}
}

