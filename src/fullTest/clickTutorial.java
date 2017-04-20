package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class clickTutorial {
	WebDriver wd;
	
	public clickTutorial(WebDriver wd){
		this.wd = wd;
	}
	
	public void clickNext(){
		System.out.println("Klik Tutorial");
		for(int i = 1; i < 5; i++)
		{
			wd.findElement(By.id("org.qluein.android:id/imgContent")).click();
		}
	}
}
