package fullTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class mainTest{
	WebDriver wd;
	
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		System.out.println("Setting Koneksi ke Device");
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("deviceName", "FAAZGF00F399");
		cap.setCapability("deviceName", "d568d8da");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "org.qluein.android");
		cap.setCapability("appActivity", "org.qluein.android.ui.activities.SplashAct");
		wd = new SwipeableWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void testCase(){
		System.out.println("Testing dimulai");
		caseLoginTest();
		caseClickTutorial();
		casePostPemerintah();
		//caseResetPassword();
		//caseAboutSetting();
		//caseLogout();
		//caseLegalSetting();
		//caseCheckUpdate();
		//caseBlockedUser();
		//caseNotificationSetting();
		//casePostingSetting();
	}
	
	/*@AfterTest
	public void closeApp(){
		System.out.println("Testing Selesai, Tutup Aplikasi Dan Memutuskan Koneksi");
		wd.quit();
	}*/
	
	public void caseLoginTest(){
		caseLoginTest objLt = new caseLoginTest(wd);
		objLt.caseLoginManual();
		//objLt.caseLoginManualWithConditions();
		//objLt.caseLoginFacebook();
		//objLt.caseLoginGoogle();
		//objLt.caseLoginGoogle();
	}
	
	public void caseClickTutorial(){
		clickTutorial objCt = new clickTutorial(wd);
		objCt.clickNext();
	}
	
	public void caseResetPassword(){
		resetPassword objRp = new resetPassword(wd);
		objRp.selectLoginManual();
		objRp.selectResetPassword();
		objRp.selectEmail();
		objRp.fillEmail();
		objRp.selectOk1();
		objRp.selectOk();
	}
	
	public void caseLogout(){
		logout objLo = new logout(wd);
		objLo.clickMore();
		objLo.clickSettingsButton();
		objLo.clickLogout();
	}
	
	public void casePostPemerintah() {
		postPemerintah objPp = new postPemerintah(wd);
		objPp.selectFAB();
		objPp.selectPemerintah();
		objPp.selectKamera();
		objPp.saveGambar();
		objPp.pilihKategori();
		objPp.isiTitle();
		objPp.sendDone();
		objPp.sendAccept();
	}
	
	public void caseAboutSetting(){
		aboutSetting objAs = new aboutSetting(wd);
		objAs.clickMore();
		objAs.clickSettingButton();
		objAs.clickAbout();
		//objAs.scrollAbout();
		objAs.backtoSetting();
	} 
	
	public void caseLegalSetting(){
		legalSetting objlS = new legalSetting(wd);
		objlS.clickMore();
		objlS.clickSetting();
		objlS.clickLegal();
		objlS.clickFAQ();
		objlS.backtoLegal1();
		objlS.clickPrivacyPolicy();
		objlS.backtoLegal2();
		objlS.clickEULA();
		objlS.backtoLegal3();
		objlS.backtoSetting();	
	}
	
	public void caseCheckUpdate(){
		checkupdateSetting objuS = new checkupdateSetting(wd);
		objuS.clickMore();
		objuS.clickSetting();
		objuS.clickCheckUpdateSetting();
		objuS.clickOk();
	}
	
	public void caseBlockedUser(){
		blockeduserSetting objbS = new blockeduserSetting(wd);
		objbS.clickMore();
		objbS.clickSetting();
		objbS.clickBlockedUsers();
		objbS.backtoSetting();
	}
	
	public void caseNotificationSetting(){
		notificationSetting objnS = new notificationSetting(wd);
		objnS.clickMore();
		objnS.clickSetting();
		objnS.clickNotification();
		objnS.clickMention();
		objnS.backtoSetting();
	}
	
	public void casePostingSetting(){
		postingSetting objpS = new postingSetting(wd);
		objpS.clickMore();
		objpS.clickSetting();
		objpS.clickPosting();
		objpS.clickSaveImage();
		objpS.backtoSetting();	
	}
}
