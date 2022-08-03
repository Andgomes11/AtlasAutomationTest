package ScriptsMentee.EmailConfirmetion;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmailConfirmetionPage {

    public static final String URL_EMAILCONFIRM = "https://mail.google.com/mail/u/0/#inbox";
    private WebDriver browser;
    ATUTestRecorder recorder;


    public EmailConfirmetionPage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver-new/chromedriver.exe");
        this.browser = new ChromeDriver();
        this.browser.navigate().to(URL_EMAILCONFIRM);

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date ();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentee", "Email Confirmetion Test "+d.format(date), false);
        recorder.start();




    }
    public void close() throws ATUTestRecorderException {
        browser.quit();
        recorder.stop();
    }
    public void loginusername(String username) {

        browser.findElement(By.id("identifierId")).sendKeys(username);
    }
    public void nextpage() {
        browser.findElement(By.id("identifierNext")).click();
    }
    public void loginpassword(String password){
        browser.findElement(By.name("password")).sendKeys(password);

    }

    public void nextpassword() {
        browser.findElement(By.id("passwordNext")).click();
    }
    public void findemail() throws InterruptedException {

        browser.findElement(By.xpath("//input[@name='q']")).sendKeys("atlas platform ");
        browser.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        browser.findElement(By.xpath("//tr/td/div/div/div2/span/span[contains(text(),'Career Guide - Email address confirmation')]")).click();



    }
}

