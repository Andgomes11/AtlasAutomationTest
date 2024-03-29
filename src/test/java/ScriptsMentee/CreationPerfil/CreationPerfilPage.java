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


    public static final String URL_USERLOGIN = "https://app.go2atlas.com/version-test/user-login";
    private WebDriver browser;
    ATUTestRecorder recorder;

    public CreationPerfilPage() throws ATUTestRecorderException {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver-new/chromedriver.exe");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_USERLOGIN);
        browser.manage().window().maximize();

        DateFormat d = new SimpleDateFormat("yy−mm−dd HH−mm−ss");
        Date date = new Date();

        recorder = new ATUTestRecorder("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AtlasAutomationTest\\Test Evidence\\Mentee", "Creation Perfil Test" + d.format(date), false);
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

    public void Gender() {
        browser.findElement(By.id("UserGender")).click();
        WebElement dropdown = browser.findElement(By.id("UserGender"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserGender >option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());

        options.get(list).click();
    }

    public void Avatar() throws InterruptedException {
        browser.findElement(By.id("UserAvatar")).click();
        browser.findElement(By.id("BTN_AppMentorshipUserAvatarRandom")).click();
        browser.findElement(By.id("BTN_AppMentorshipUserAvatarChoosen")).click();
        browser.findElement(By.id("dropDownHair")).click();
        WebElement dropdown = browser.findElement(By.id("dropDownHair"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#dropDownHair >option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();

        browser.findElement(By.id("dropDownGlasses")).click();
        WebElement dropdown2 = browser.findElement(By.id("dropDownGlasses"));
        List<WebElement> options2 = dropdown2.findElements(By.cssSelector("#dropDownGlasses >option"));
        Random rand2 = new Random();
        int list2 = rand2.nextInt(options2.size());
        options2.get(list2).click();

        browser.findElement(By.id("dropDownGlasses")).click();
        WebElement dropdown3 = browser.findElement(By.id("dropDownGlasses"));
        List<WebElement> options3 = dropdown3.findElements(By.cssSelector("#dropDownGlasses >option"));
        Random rand3 = new Random();
        int list3 = rand3.nextInt(options3.size());
        options3.get(list3).click();


        browser.findElement(By.id("dropDownBeard")).click();
        WebElement dropdown4 = browser.findElement(By.id("dropDownBeard"));
        List<WebElement> options4 = dropdown4.findElements(By.cssSelector("#dropDownBeard >option"));
        Random rand4 = new Random();
        int list4 = rand4.nextInt(options4.size());
        options4.get(list4).click();
        Thread.sleep(5000);

        browser.findElement(By.id("BTN_AppMentorshipCaseSubmit")).click();
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
        int list = rand.nextInt(options.size());
        options.get(list + 1).click();
    }

    public void YearBirth() {
        browser.findElement(By.id("UserYearBirth")).click();
        WebElement dropdown = browser.findElement(By.id("UserYearBirth"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserYearBirth >option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
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
        int list = rand.nextInt(options.size());
        options.get(list + 1).click();

    }

    public void CareerPosition() {
        browser.findElement(By.id("UserCareerPosition")).click();
        WebElement dropdown = browser.findElement(By.id("UserCareerPosition"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserCareerPosition >option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list).click();
    }

    public void EducationalDegree() {
        browser.findElement(By.id("UserCurrentEducationalDegree")).click();
        WebElement dropdown = browser.findElement(By.id("UserCurrentEducationalDegree"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("#UserCurrentEducationalDegree >option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list + 1).click();
    }

    public void CheckBox() {
        browser.findElement(By.id("UserSendEmailOptIn")).click();
    }

    public void Save() {
        browser.findElement(By.id("BTN_AppMentorshipUserProfileSave")).click();
    }

    public void language() {
        browser.findElement(By.id("ChooseLanguage")).click();
        WebElement dropdown = browser.findElement(By.id("ChooseLanguage"));
        List<WebElement> options = dropdown.findElements(By.cssSelector("option"));
        Random rand = new Random();
        int list = rand.nextInt(options.size());
        options.get(list + 1).click();
    }
}




