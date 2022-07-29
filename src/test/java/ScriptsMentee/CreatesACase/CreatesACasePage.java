package ScriptsMentee.CreatesACase;

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



public class CreatesACasePage {

    public static final String URL_USERLOGIN = "https://app.go2atlas.com/version-v0-2-011b-uelinton/user-login";
    private WebDriver browser;
    ATUTestRecorder recorder;

    public CreatesACasePage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver/chromedriver.exe");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_USERLOGIN);
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentee", "Creates A Case Test" + d.format(date), false);
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
        browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/button[1]")).click();
        browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/button[1]")).click();
    }

    public void SliderMenu() {
        browser.findElement(By.xpath("//div[@id='SlidebarMenu']")).click();}

    public void ChoseCarrer() {
        browser.findElement(By.xpath("/html/body/div[11]/div[3]")).click();
    }

    public void SearchACareer() {
        browser.findElement(By.xpath("//div[2]/div/div")).click();
    }

    public void FilterCareerDomain() {
        browser.findElement(By.id("FilterCareerDomain")).click();
        WebElement dropdown = browser.findElement(By.id("FilterCareerDomain"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#FilterCareerDomain >option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void ChooseCareer() {
        WebElement dropdown = browser.findElement(By.id("ClickToChooseCareer"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#ClickToChooseCareer h2"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();


    }


    public void Save() {
        browser.findElement(By.id("BTN_AppMentorshipCaseSubmit")).click();
    }

    public void NewCase() {
        browser.findElement(By.xpath("//div[contains(text(),'New Case')]")).click();

    }

    public void Title() {
        Lorem lorem = LoremIpsum.getInstance();
        browser.findElement(By.xpath("//input[@type='input']")).sendKeys(lorem.getTitle(2, 4));

    }

    public void Problem() {
        Lorem lorem = LoremIpsum.getInstance();
        browser.findElement(By.id("ProblemDescription")).sendKeys(lorem.getParagraphs(2, 3));
    }

    public void Carrer() {
        browser.findElement(By.cssSelector(".Input:nth-child(1)")).click();
        WebElement dropdown = browser.findElement(By.id("GroupFocusSearchCareer"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#GroupFocusSearchCareer h2"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void ContextTags() {
        browser.findElement(By.id("ContextTagsInput")).click();
        WebElement dropdown = browser.findElement(By.id("ContextTagsInput"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("select  option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void Submitted() {
        browser.findElement(By.xpath("//button[contains(text(),'send')]")).click();
        browser.findElement(By.xpath("//button[contains(text(),'send')]")).click();
    }
}
