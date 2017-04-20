package fullTest;

import org.openqa.selenium.WebDriver;

public class caseLoginTest {
	WebDriver wd;
	
	public caseLoginTest(WebDriver wd){
		this.wd = wd;
	}
	
	public void caseLoginManualWithConditions(){
		loginManual objLmwc = new loginManual(wd);
		objLmwc.selectLoginManual();
		objLmwc.loginWithIncorrectPassword();
		objLmwc.loginWithIncorrectUsername();
		objLmwc.loginWithoutRegex();
		objLmwc.loginWithRegex();
	}
	
	public void caseLoginManual(){
		loginManual objLm = new loginManual(wd);
		objLm.selectLoginManual();
		objLm.loginCorrected();
	}
	
	public void caseLoginFacebook(){
		loginFacebook objLf = new loginFacebook(wd);
		objLf.selectLoginFacebook();
	}
	
	public void caseLoginGoogle(){
		loginGoogle objLg = new loginGoogle(wd);
		objLg.selectloginGoogle();
		objLg.selectEmail();
	}
}
