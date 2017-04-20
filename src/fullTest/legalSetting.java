package fullTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class legalSetting {
	WebDriver wd;

	public legalSetting(WebDriver wd) {
		this.wd= wd;
	}
	
	public void clickMore(){
		System.out.println("Klik More Button");
		wd.findElement(By.xpath("//android.widget.ImageButton[@index='4']")).click();
	}
	
	public void clickSetting(){
		System.out.println("Klik Setting Button");
		wd.findElement(By.id("org.qluein.android:id/linearSettings")).click();
	}
	
	public void clickLegal(){
		System.out.println("Klik Legal Button");
		wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='5']")).click();
		
	}
	
	public void clickFAQ(){
		System.out.println("Klik FAQ Button");
		wd.findElement(By.name("FAQ")).click();
		
	}
	
	public void backtoLegal1(){
		System.out.println("Back To Legal 1");
		wd.navigate().back();
	}
	
	public void clickPrivacyPolicy(){
		System.out.println("Klik Privacy Policy Button");
		wd.findElement(By.name("Privacy Policy")).click();
	}
	
	public void backtoLegal2(){
		System.out.println("Back To Legal 2");
		wd.navigate().back();
	}
	
	public void clickEULA(){
		System.out.println("Klik EULA Button");
		wd.findElement(By.name("EULA")).click();
	}
	
	public void backtoLegal3(){
		System.out.println("Back To Legal 3");
		wd.navigate().back();
	}
	
	public void backtoSetting(){
		System.out.println("Back To Setting");
		wd.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
	}
	
}
