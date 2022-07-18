package ScriptsMentor.Registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

    private ScriptsMentor.Registration.RegistrationPage RegistrationPage;

    @BeforeEach
    public void beforeEach() {
        this.RegistrationPage = new RegistrationPage();
    }

    //@AfterEach
    //public void afterEach() {this.RegistrationPage.close();}

    @Test
    public void PutDataForCreatingARecord() throws InterruptedException {
        RegistrationPage.FillInRegistrationForm("anderson.gomes+mentor001@go2atlas.com", "123456");
        RegistrationPage.WaitForLoading();
        RegistrationPage.SignUp();
        RegistrationPage.WaitForLoading();

    }




}



