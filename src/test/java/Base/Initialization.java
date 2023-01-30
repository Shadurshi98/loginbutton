package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Initialization {
	
	public static ExtentReports extent;
    public static ExtentHtmlReporter htmlreporter;
    public static ExtentTest testCase;
    
 public static WebDriver driver;
 

@BeforeSuite
 public void main() throws IOException {
 
System.setProperty("WebDriver.chrome.driver","C:\\Program Files\\chromedriver_selenium/chromedriver.exe");
  driver = new ChromeDriver();
 
driver.manage().window().maximize();
  driver.get("http://192.168.1.35:8083/#/login");


  extentreport();
 }
 @AfterSuite
public void close() {
 extent.flush();
 }
 public static void extentreport() throws IOException {
 extent =new ExtentReports();
 htmlreporter = new ExtentHtmlReporter("C:\\Users\\sgic\\eclipse-workspace\\QDMS-Report\\report\\report.html");
 extent.attachReporter(htmlreporter);
 }

}



