package ScriptsMentee.SurveySkillsAndKnowLedge;

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

    public static final String URL_USERLOGIN = "https://app.go2atlas.com/version-test/user-login";
    private WebDriver browser;
    ATUTestRecorder recorder;

    public SurveySkillsAndKnowledgePage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver-new/chromedriver.exe");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_USERLOGIN);
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentee", "Survey Skills And Know LedgeTest" + d.format(date), false);
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
        browser.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button[1]")).click();
        browser.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button[1]")).click();

    }

    public void SliderMenu() {
        browser.findElement(By.xpath("//div[@id='SlidebarMenu']")).click();
    }

    public void UserTraits() {browser.findElement(By.xpath("/html/body/div[11]/div[8]")).click();
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

    public void SelectorSkills1() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();



    }

    public void SelectorSkills2() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills3() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills4() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills5() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills6() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[6]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills7() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills8() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[8]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills9() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[9]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills10() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[10]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills11() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[11]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills12() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[12]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills13() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[13]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills14() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[14]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills15() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[15]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills16() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[16]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills17() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[17]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills18() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[18]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills19() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[19]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills20() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[20]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills21() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[21]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills22() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[22]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills23() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[23]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills24() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[24]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills25() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[25]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills26() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[26]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills27() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[27]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills28() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[28]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills29() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[29]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills30() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[30]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills31() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[31]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }
    public void SelectorSkills32() {
        WebElement dropdown = browser.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[32]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }

    public void Submit() {
        browser.findElement(By.id("BTN_AppAnchorAssessmentSubmit")).click();
    }

    public void LeadsSend() {
        browser.findElement(By.id("BTN_AppAnchorAssessmentLeadsSend")).click();
    }

    public void Continue() {
        browser.findElement(By.id("BTN_AppAnchorAssessmentLeadsContinue")).click();
    }

    public void AtlasRating() {
        WebElement dropdown = browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[2]"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("button"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void CurrentSituation() {
        browser.findElement(By.id("dropdown_user_current_situation")).click();
        WebElement dropdown = browser.findElement(By.id("dropdown_user_current_situation"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

    }

    public void Finish() {
        browser.findElement(By.xpath("//*[@id=\"BTN_AppDiscAssessmentFeedbackFinish\"]")).click();
    }

    public void ScrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor)browser;
        jse.executeScript("scrollBy(0,750)", "");
    }

    public void SurveySkills() {
        browser.findElement(By.xpath("//div[contains(text(),'Skill And Knowledge')]")).click();
    }
}
