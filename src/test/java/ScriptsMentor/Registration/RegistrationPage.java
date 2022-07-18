package ScriptsMentor.Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

    private WebDriver browser;

    public RegistrationPage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/Chrome-chromedriver/chromedriver.exe");
        this.browser = new ChromeDriver();
        this.browser.navigate().to("https://app.go2atlas.com/version-v0-2-011a-uelinton/user-signup?r=mentor");
    }

    public void close() {
        this.browser.quit();
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
