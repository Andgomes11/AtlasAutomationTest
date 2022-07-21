package ScriptsMentee.CreationPerfil;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class CreationPerfilPage {


    public static final String URL_USERLOGIN = "https://app.go2atlas.com/version-v0-2-011a-uelinton/user-login/";
    private WebDriver browser;
    ATUTestRecorder recorder;

    public CreationPerfilPage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver/chromedriver.exe");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_USERLOGIN);
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date ();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentee", "Creation Perfil Test"+d.format(date), false);
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

    public void Gender() {
        browser.findElement(By.id("UserGender")).click();
        WebElement dropdown = browser.findElement(By.id("UserGender"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserGender >option"));
        Random rand = new Random();
        int list= rand.nextInt(options.size());

        options.get(list).click();
    }

    public void Avatar()  {
        browser.findElement(By.id("UserAvatar")).click();
        browser.findElement(By.id("BTN_AppMentorshipUserAvatarRandom")).click();
        browser.findElement(By.id("BTN_AppMentorshipUserAvatarChoosen")).click();
    }

    public void FirstName() {
        Lorem lorem = LoremIpsum.getInstance();
        browser.findElement(By.id("UserFirstName")).sendKeys(lorem.getName());

    }
    public void LastName() {
        Lorem lorem = LoremIpsum.getInstance();
        browser.findElement(By.id("UserLastName")).sendKeys(lorem.getLastName());
    }

    public void MonthBirth() {
        browser.findElement(By.id("UserMonthBirth")).click();
        WebElement dropdown = browser.findElement(By.id("UserMonthBirth"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserMonthBirth >option"));
        Random rand = new Random();
        int list= rand.nextInt(options.size());
        options.get(list+1).click();
    }

    public void YearBirth() {
        browser.findElement(By.id("UserYearBirth")).click();
        WebElement dropdown = browser.findElement(By.id("UserYearBirth"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserYearBirth >option"));
        Random rand = new Random();
        int list= rand.nextInt(options.size());
        options.get(list).click();
    }

    public void Userlocation() {
        Lorem lorem = LoremIpsum.getInstance();
        browser.findElement(By.xpath("//div[@id='UserLocation']/span/input[2]")).sendKeys(lorem.getCity());
        browser.findElement(By.xpath("//div[@id='UserLocation']/span/input[2]")).sendKeys(Keys.TAB);
    }
    public void Stage() {
        browser.findElement(By.id("UserCurrentCareerStage")).click();
        WebElement dropdown = browser.findElement(By.id("UserCurrentCareerStage"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserCurrentCareerStage >option"));
        Random rand = new Random();
        int list= rand.nextInt(options.size());
        options.get(list+1).click();

    }

    public void CareerPosition() {
        browser.findElement(By.id("UserCareerPosition")).click();
        WebElement dropdown = browser.findElement(By.id("UserCareerPosition"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserCareerPosition >option"));
        Random rand = new Random();
        int list= rand.nextInt(options.size());
        options.get(list+1).click();
    }

    public void EducationalDegree() {
        browser.findElement(By.id("UserCurrentEducationalDegree")).click();
        WebElement dropdown = browser.findElement(By.id("UserCurrentEducationalDegree"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserCurrentEducationalDegree >option"));
        Random rand = new Random();
        int list= rand.nextInt(options.size());
        options.get(list+1).click();
    }

    public void CheckBox() {
        browser.findElement(By.id("id=1657291147987x8744")).click();
    }

    public void Save() {
        browser.findElement(By.id("BTN_AppMentorshipUserProfileSave")).click();
    }


}

