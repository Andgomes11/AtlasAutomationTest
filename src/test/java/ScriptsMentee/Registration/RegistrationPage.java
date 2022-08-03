package ScriptsMentee.Registration;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RegistrationPage {

    private WebDriver browser;
    ATUTestRecorder recorder;

    public RegistrationPage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver-new/chromedriver.exe");
        this.browser = new ChromeDriver();
        this.browser.navigate().to("https://app.go2atlas.com/version-test/user-signup");
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date ();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentee", "Registration Test"+d.format(date), false);
        recorder.start();

    }

    public void close() throws ATUTestRecorderException {
        this.browser.quit();
        recorder.stop();
    }

    public void FillInRegistrationForm(String Username, String Password) {
        browser.findElement(By.xpath("//input[@type='email']")).sendKeys(Username);
        browser.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
        browser.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(Password);

    }
    public void SignUp() {
        browser.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button[1]")).click();
    }


    public void WaitForLoading() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void language() {
        browser.findElement(By.xpath("//body/div[1]/div[3]/select[1]")).click();
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/select[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }
}
