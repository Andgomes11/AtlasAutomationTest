package UserNonAuthenticated.SurveySkillsAndKnowLedge;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class SurveySkillsAndKnowledgePage {

    public static final String URL_INDEX = "https://app.go2atlas.com/version-test";
    private WebDriver browser;
    ATUTestRecorder recorder;

    public SurveySkillsAndKnowledgePage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver-new/chromedriver.exe");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_INDEX);
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\User Non Authenticated", "Survey Skills And Know LedgeTest" + d.format(date), false);
        recorder.start();

    }

    public void close() throws ATUTestRecorderException {

        browser.quit();
        recorder.stop();
    }


    public void language() {
            WebElement dropdown = browser.findElement(By.id("ChooseLanguage"));
            List<WebElement> options = dropdown.findElements(By.cssSelector("option"));
            Random rand = new Random();
            int list = rand.nextInt(options.size());
            options.get(list + 1).click();
        }

    public void findCareer() {
        browser.findElement(By.id("BTN_AppHomeStartHere")).click();
    }

    public void SelectorSkills() throws InterruptedException {
        for (int i = 1; i <= 32; i ++) {

            WebElement dropdown = browser.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div["+i+"]/div/div[3]/div[2]/div/div/div[1]"));
            List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
            Random rand = new Random();
            int list = rand.nextInt(options.size());
            options.get(list).click();
            Thread.sleep(2000);
        }

    }

    public void Submitted() {
        browser.findElement(By.id("BTN_AppSkillAssessmentSubmit")).click();
    }

    public void RadioButton() {
        WebElement dropdown = browser.findElement(By.id("RadioButtonDegrees"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("label"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }

    public void Continue() {
        browser.findElement(By.id("BTN_AppSkillAndKnowAssessmentLeadsSend")).click();
    }
}
