package LogoutGID.LogoutAID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestLO {
	
	WebDriver bo;
	String buildpath="http://dmlogics.in/build5/Loging.html";
	
	@Test
	  public void MainHMR_TC_00007() throws InterruptedException {
		  
		  
		    //userid
		    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kishore");
		    Thread.sleep(1000);
		    
		    //password
		    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("kishore");
		    Thread.sleep(1000);
		    
		    //login
		    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/center[1]/input[1]")).click();
		    Thread.sleep(1000);
		    
		   //logout link
		    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/a[1]/b[1]/font[1]")).click();
		    Thread.sleep(2000);
		    
		    Assert.assertEquals(bo.getTitle(), "HMR");
		    Thread.sleep(1000);
		        
		    
	  }
	@BeforeMethod
	  public void buildexecution() {
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		  bo=new FirefoxDriver();
		  bo.get(buildpath);  
		  
	  }

	  @AfterMethod
	  public void buildclose() {
		  
		  bo.close();
		  
		}
}
