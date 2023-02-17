package in.co.automationtesting.QA2Project;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.ExtentManager;
import com.base.Hooks;
import com.pageObjects.Homepage;
import com.pageObjects.PasswordPage;

@Listeners(com.resources.Listeners.class)

public class End2EndTest extends Hooks{

	public End2EndTest() throws IOException {
		super();
		
	}
	
	@Test
	public void enterPasswordPage() throws IOException, InterruptedException {
		ExtentManager.log("Starting QA2 Test Environment...");
		PasswordPage pg = new PasswordPage();
		pg.getPassLink().click();
		ExtentManager.log("Entering the Password...");
		pg.getPassWord().sendKeys("olyiel");
		
		Thread.sleep(3000);
		pg.getButtonClick().click();
		
		ExtentManager.log("Navigating to Homepage...");
		Homepage hp = new Homepage();
		hp.getAcceptButton().click();
		Thread.sleep(3000);
		
	}

}
