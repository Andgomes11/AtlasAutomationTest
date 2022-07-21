package ScriptsMentor.Registration;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationPage {

    private WebDriver browser;
    ATUTestRecorder recorder;

    public RegistrationPage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver/chromedriver.exe");
        this.browser = new ChromeDriver();
        this.browser.navigate().to("https://app.go2atlas.com/version-v0-2-011a-uelinton/user-signup?r=mentor");
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date ();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentor", "Registration Test"+d.format(date), false);
        recorder.start();
    }

    public void close() throws ATUTestRecorderException {
        this.browser.quit();
        recorder.stop();
    }

    public void FillInRegistrationForm(String Username, String Password) {
        browser.findElement(By.cssSelector("div.main-page.bubble-element.Page.bubble-r-container.flex.column:nth-child(5) div.bubble-element.Group.bubble-r-container.flex.column:nth-child(3) div.bubble-element.Group.bubble-r-container.flex.column:nth-child(2) div.bubble-element.Group.bubble-r-container.flex.column:nth-child(1) div.bubble-element.Group.bubble-r-container.flex.column:nth-child(1) div.bubble-element.Group.bubble-r-container.flex.row:nth-child(2) > input.bubble-element.Input:nth-child(2)")).sendKeys(Username);
        browser.findElement(By.xpath("//body/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/input[1]")).sendKeys(Password);
        browser.findElement(By.xpath("//body/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/input[1]")).sendKeys(Password);

    }
    public void SignUp() {
        browser.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
    }


    public void WaitForLoading() throws InterruptedException {
        Thread.sleep(2000);
    }
}
