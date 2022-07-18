package ScriptsMentor.EmailConfirmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailConfirmationPage {

    public static final String URL_EMAILCONFIRM = "https://mail.google.com/mail/u/0/#inbox";
    private WebDriver browser;


    public EmailConfirmationPage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver/chromedriver.exe");
        this.browser = new ChromeDriver();
        this.browser.navigate().to(URL_EMAILCONFIRM);
    }
    public void close() {
        browser.quit();
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
    public void findemail() {
        browser.findElement(By.id("gk")).click();
    }
}

