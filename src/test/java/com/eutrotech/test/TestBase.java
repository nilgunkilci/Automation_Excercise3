package com.eutrotech.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;
    @BeforeTest
    public void setUpTest(){
    report = new ExtentReports();
    String projectPath= System.getProperty("user.dir");
    String path = projectPath+"/test-output/report.html";
    htmlReporter=new ExtentHtmlReporter(path);
    report.attachReporter(htmlReporter);

    htmlReporter.config().setReportName("AutomationExercise  smoke test");
    report.setSystemInfo("Environment","OnlineMarketing");
    report.setSystemInfo("Browser",ConfigurationReader.get("browser"));
    report.setSystemInfo("OS",System.getProperty("os.name"));
    report.setSystemInfo("Test Engineer","Nilgün Kilci");
    }
    @AfterTest
    public void tearDownTest(){
        report.flush();
    }


    @BeforeMethod
    public void setUp(){
        driver= Driver.get();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
        actions=new Actions(driver);
        wait=new WebDriverWait(Driver.get(),15);
        //driver.get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException, IOException {
        // if test fails
        if(result.getStatus()==ITestResult.FAILURE){
            //Record the name of the failed test
            extentLogger.fail(result.getName());
            //Take the screenshot and return the location of screenshot
            String screenShotPath= BrowserUtils.getScreenshot(result.getName());
            //Add the screenshot to the report
            extentLogger.addScreenCaptureFromPath(screenShotPath);
            //capture the exception and put inside the report
            extentLogger.fail(result.getThrowable());
        }
        Thread.sleep(2000);
       // driver.close();
        Driver.closeDriver();

    }
}
