package fullTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class postPemerintah {
	WebDriver wd;

	public postPemerintah(WebDriver wd){
		this.wd = wd;
	}
	
	public void selectFAB(){
		System.out.println("Klik FAB");
		wd.findElement(By.id("org.qluein.android:id/imgNewFab")).click();
	}		
	
	public void selectPemerintah(){
		System.out.println("Pilih Pemerintah");
		wd.findElement(By.id("org.qluein.android:id/lyLaporPermasalahan")).click();
		
	}
	
	public void selectKamera(){
		System.out.println("Pilih Kamera");
		wd.findElement(By.id("org.qluein.android:id/capture_image_button")).click();
	}
		
	public void saveGambar(){
		System.out.println("Save Gambar");
		wd.findElement(By.id("org.qluein.android:id/save_photo")).click();
	}
	
	public void pilihKategori(){
		System.out.println("Pilih Kategori");
		wd.findElement(By.xpath("//android.widget.RelativeLayout[@index='7']")).click();
	}
	
	public void isiTitle(){
		System.out.println("Isi Title");
		wd.findElement(By.id("org.qluein.android:id/inpSearch")).sendKeys("Coba Auth");
	}
	
	public void sendDone(){
		System.out.println("Send");
		wd.findElement(By.id("org.qluein.android:id/btnDone")).click();
	}
	
	public void sendAccept(){
		System.out.println("Accept Laporan");
		wd.findElement(By.id("org.qluein.android:id/btnSubmit")).click();
		
	
	}
}

