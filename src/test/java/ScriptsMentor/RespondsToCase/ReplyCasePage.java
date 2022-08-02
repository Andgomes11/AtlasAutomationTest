package ScriptsMentor.RespondsToCase;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ReplyCasePage {

    public static final String URL_USERLOGIN = "https://app.go2atlas.com/version-v0-2-011b-uelinton/user-login/1657539414174x991748962311625900";
    private WebDriver browser;
    ATUTestRecorder recorder;
    Lorem lorem = LoremIpsum.getInstance();
    public ReplyCasePage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver/chromedriver.exe");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_USERLOGIN);
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date ();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentor", "Reply Case Test"+d.format(date), false);
        recorder.start();
    }
    public void close() throws ATUTestRecorderException {
        browser.quit();
        recorder.stop();
    }
    public void login(String username, String password) {
        browser.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
        browser.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    }
    public void submit() {
        browser.findElement(By.xpath("//button[contains(.,'Log In')]")).click();
        browser.findElement(By.xpath("//button[contains(.,'Log In')]")).click();
    }
    public void ChooseCase() {
        browser.findElement(By.xpath("//*[contains(text(),'Reviewing')]")).click();
    }
    public void WaitForLoading() throws InterruptedException {

        Thread.sleep(10000);
    }
    public void CaseResponseTitle() {
        browser.findElement(By.id("UserCaseResponseTitle")).sendKeys(lorem.getTitle(2, 4));
    }
    public void CaseResponseDescription() {
        browser.findElement(By.id("UserCaseResponseDescription")).sendKeys(lorem.getTitle(2, 4));

    }
    public void RiskLevel() {
        browser.findElement(By.id("UserResponseRiskLevel")).click();
        WebElement dropdown = browser.findElement(By.id("UserResponseRiskLevel"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserResponseRiskLevel >option"));
        Random rand = new Random();
        int list= rand.nextInt(options.size());
        options.get(list).click();
    }
    public void EffortLevel() {
        browser.findElement(By.id("UserResponseEffortLevel")).click();
        WebElement dropdown = browser.findElement(By.id("UserResponseEffortLevel"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserResponseEffortLevel >option"));
        Random rand = new Random();
        int list= rand.nextInt(options.size());
        options.get(list).click();
    }
    public void CostLevel() {
        browser.findElement(By.id("UserResponseCostLevel")).click();
        WebElement dropdown = browser.findElement(By.id("UserResponseCostLevel"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserResponseCostLevel >option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }
        public void RiskComments() {
        browser.findElement(By.id("UserCaseResponseRiskRemarks")).sendKeys(lorem.getTitle(2, 2));
    }
    public void EffortComments() {
        browser.findElement(By.id("UserCaseResponseEffortRemarks")).sendKeys(lorem.getTitle(2, 2));
    }
    public void CostComments() {
        browser.findElement(By.id("UserCaseResponseCostRemarks")).sendKeys(lorem.getTitle(2, 2));
    }
    public void SubmitComments() {
        browser.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
    }
}

