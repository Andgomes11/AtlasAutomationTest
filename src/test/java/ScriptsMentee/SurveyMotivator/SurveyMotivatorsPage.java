package ScriptsMentee.SurveyMotivator;

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

public class SurveyMotivatorsPage {

    public static final String URL_USERLOGIN = "https://app.go2atlas.com/version-test/user-login";
    private WebDriver browser;
    ATUTestRecorder recorder;

    public SurveyMotivatorsPage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver-new/chromedriver.exe");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_USERLOGIN);
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentee", "Survey Motivators Test" + d.format(date), false);
        recorder.start();

    }

    public void close() throws ATUTestRecorderException {

        browser.quit();
        recorder.stop();
    }

    public void language() {
        browser.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/select[1]")).click();
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/select[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list + 1).click();
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
        browser.findElement(By.xpath("//div[@id='SlidebarMenu']")).click();
    }


    public void UserTraits() {browser.findElement(By.xpath("/html/body/div[11]/div[8]")).click();
    }
    public void Motivators() {browser.findElement(By.xpath("//div[contains(text(),'Style')]")).click();}
    public void AnchorAssessment1() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[1]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }

    public void AnchorAssessment2() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[2]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment3() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[3]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment4() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[4]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment5() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[5]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment6() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[6]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment7() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[7]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment8() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[8]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment9() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[9]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment10() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[10]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment11() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[11]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment12() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[12]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment13() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[13]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment14() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[14]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment15() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[15]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment16() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[16]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment17() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[17]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment18() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[18]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment19() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[19]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void AnchorAssessment20() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[@id='page-anchor-assessment']/div[@id='group-answers-and-careers']/div[2]/div[20]/div[1]/div[2]/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }
    public void Submitted() {
        browser.findElement(By.xpath("//button[@id='BTN_AppAnchorAssessmentSubmit']")).click();

    }




}


