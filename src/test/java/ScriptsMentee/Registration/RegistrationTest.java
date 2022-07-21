package ScriptsMentee.Registration;

import ScriptsMentee.Registration.RegistrationPage;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

    private ScriptsMentee.Registration.RegistrationPage RegistrationPage;

    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.RegistrationPage = new RegistrationPage();
    }

    @AfterEach
    public void afterEach() throws ATUTestRecorderException {this.RegistrationPage.close();}

    @Test
    public void PutDataForCreatingARecord() throws InterruptedException {
        RegistrationPage.FillInRegistrationForm("anderson.gomes+mentee005@go2atlas.com", "123456");
        RegistrationPage.WaitForLoading();
        RegistrationPage.SignUp();

    }




}



