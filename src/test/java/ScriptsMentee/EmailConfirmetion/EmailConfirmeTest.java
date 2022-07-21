package ScriptsMentee.EmailConfirmetion;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailConfirmeTest {

    private EmailConfirmetionPage EmailPage;


    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.EmailPage = new EmailConfirmetionPage();
    }
    @AfterEach
    public void afterEach() throws ATUTestRecorderException {
        this.EmailPage.close();
    }

    @Test
    public void LoginEmailUser() throws InterruptedException {
        EmailPage.loginusername("anderson.gomes@go2atlas.com");
        Thread.sleep(1000);
        EmailPage.nextpage();
        Thread.sleep(1000);
        EmailPage.loginpassword("pp181121");
        Thread.sleep(1000);
        EmailPage.nextpassword();
        Thread.sleep(5000);
        EmailPage.findemail();
        Thread.sleep(5000);


    }

}


