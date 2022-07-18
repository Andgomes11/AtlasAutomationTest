package ScriptsMentor.CreationPerfil;

import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreationPerfilTest {


    private CreationPerfilPage loginUser;

    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.loginUser = new CreationPerfilPage();
    }
    //@AfterEach
    public void afterEach() {
        this.loginUser.close();
    }

    @Test
    public void MustLogIn() throws InterruptedException {
        this.loginUser.login("anderson.gomes+mentor001@go2atlas.com", "123456");
        this.loginUser.submit();
        Thread.sleep(5000);
        this.loginUser.Gender();
        Thread.sleep(5000);
        this.loginUser.Avatar();
        Thread.sleep(5000);
        this.loginUser.FirstName();
        Thread.sleep(5000);
        this.loginUser.LastName();
        Thread.sleep(5000);
        this.loginUser.MonthBirth();
        Thread.sleep(5000);
        this.loginUser.YearBirth();
        Thread.sleep(5000);
        this.loginUser.Userlocation();
        Thread.sleep(5000);
        this.loginUser.Stage();
        Thread.sleep(5000);
        this.loginUser.CareerPosition();
        Thread.sleep(5000);
        this.loginUser.EducationalDegree();
        //this.loginUser.CheckBox();
        this.loginUser.Save();



    }


    }

