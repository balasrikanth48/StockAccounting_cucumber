package commonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.internal.PropertiesFile;

import net.bytebuddy.asm.Advice.Enter;

public class FunctionLibrary {
	 static WebDriver driver;
	 public  static WebDriver startBrowser() throws IOException
	 {
			  	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
				 driver.manage().deleteAllCookies();
				 return driver;
	 }
	 public static WebDriver openApp(WebDriver driver) throws IOException
		{
			driver.get("http://webapp.qedge.com/");
			driver.manage().window().maximize();
			return driver;
		} 
	 public static void waitforElement(WebDriver driver,String locatortype,String locatorvalue,String waittime)
	{
		WebDriverWait mywait=new WebDriverWait(driver, Integer.parseInt(waittime));
		if (locatortype.equalsIgnoreCase("id"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
		}
		else if (locatortype.equalsIgnoreCase("xpath"))
		{
//			System.out.println("waiting for "+locatortype+"  "+locatorvalue);
		 mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));	
		}
		else if (locatortype.equalsIgnoreCase("name"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
		}else
		{
			System.out.println("unable to loacte waitforelement method with"+"  "+locatortype);
		}
		
	}
	 public static void typeAction(WebDriver driver,String locatortype,String locatorvalue,String testdata)
	{
		if (locatortype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatorvalue)).clear();
		  driver.findElement(By.id(locatorvalue)).sendKeys(testdata);
		}
		else if (locatortype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(locatorvalue)).clear();
			 driver.findElement(By.xpath(locatorvalue)).sendKeys(testdata);
		}
		else if (locatortype.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(locatorvalue)).clear();
			 driver.findElement(By.name(locatorvalue)).sendKeys(testdata);
		}else
		{
			System.out.println("unable to loacte typeAction method with"+"  "+locatortype);
		}
	}
	 public static void clickAction(WebDriver driver,String locatortype,String locatorvalue )
	 {
		 if (locatortype.equalsIgnoreCase("id"))
			{
				driver.findElement(By.id(locatorvalue)).click();
			
			}
		 else if (locatortype.equalsIgnoreCase("xpath"))
			{ 
//			 System.out.println("clicking the button "+locatortype+""  +locatorvalue);
				driver.findElement(By.xpath(locatorvalue)).sendKeys(Keys.ENTER);
		
			}
		 else if (locatortype.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(locatorvalue)).click();
		
			}else
			{
				System.out.println("unable to loacte clickAction method with"+" "+locatortype);
			}
		 
	 }
	public static void closeApp(WebDriver driver)
	{    
	 
	
			
			 driver.close();
	 
	}
   public static String getdate()
   {
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("YYYY_MM_DD_hh_mm_ss");
	String req=sdf.format(d);
	System.out.println(req);
	return req;
	
   }
   public static void CapturingData(WebDriver driver,String locatortype,String locatorvalue) throws IOException, InterruptedException
   {
	    String SupplierData="";
	    
		 SupplierData=driver.findElement(By.id(locatorvalue)).getAttribute("value");
		
	 System.out.println("suppe"+" "+SupplierData);
	 FileWriter fr=new FileWriter("E:\\Srikanth_82\\StockAccounting_Cucumber\\CaputureData\\SupplierData.txt");
	 BufferedWriter br=new BufferedWriter(fr);
	 br.write(SupplierData);
	 br.flush();
	 br.close();


}
   public static void tableValidation(WebDriver driver,String colomn) throws IOException, InterruptedException
   {
	   java.io.FileReader fr=new java.io.FileReader(System.getProperty("user.dir")+"\\CaputureData\\SupplierData.txt");
	   BufferedReader br=new BufferedReader(fr);
	   String Exp_data=br.readLine();
	   System.out.println("exp:"+Exp_data);
	   if (driver.findElement(By.id("psearch")).isDisplayed()) 
	   {
		driver.findElement(By.id("psearch")).sendKeys(Exp_data);
		driver.findElement(By.id("btnsubmit")).click();
		   
	   }else
	   {
		   driver.findElement(By.xpath("//button[@class='btn btn-default ewSearchToggle']")).click();
		   Thread.sleep(2000);
			driver.findElement(By.id("psearch")).sendKeys(Exp_data);
			driver.findElement(By.id("btnsubmit")).click();
	
	   }
	   WebElement table=driver.findElement(By.id("tbl_a_supplierslist"));
	    java.util.List<WebElement> rows=driver.findElements(By.tagName("tr"));
	    for (int i = 1; i < rows.size(); i++) 
	    {
			String act_data=driver.findElement(By.xpath("//table[@id='tbl_a_supplierslist']/tbody/tr["+i+"]/td["+colomn+"]/div/span")).getText();
			Assert.assertEquals(act_data, Exp_data);
			System.out.println(act_data+"  "+Exp_data);
			break;
		}
	   
	   
	   
	   
	   
   }

}
