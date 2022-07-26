package ScriptsMentee.CreatesACase;

import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.TakesScreenshot;

public class CreatesACaseTest {

    private CreatesACasePage Case;

    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.Case = new CreatesACasePage();
    }
    @AfterEach
    public void afterEach() throws ATUTestRecorderException {
        this.Case.close();
    }

    @Test
    public void ChoisenCarrerAndCreateACase() throws InterruptedException {

        this.Case.login("anderson.gomes+mentee002@go2atlas.com", "12345");
        this.Case.submit();
        Thread.sleep(10000);
        this.Case.SliderMenu();
        Thread.sleep(5000);
        this.Case.ChoseCarrer();
        Thread.sleep(5000);
        this.Case.SearchACareer();
        Thread.sleep(5000);
        this.Case.FilterCareerDomain();
        Thread.sleep(5000);
        this.Case.ChooseCareer();
        Thread.sleep(5000);
        this.Case.Save();
        Thread.sleep(10000);
        this.Case.SliderMenu();
        Thread.sleep(5000);
        this.Case.NewCase();
        Thread.sleep(5000);
        this.Case.Title();
        Thread.sleep(5000);
        this.Case.Problem();
        Thread.sleep(5000);
        this.Case.Carrer();
        Thread.sleep(5000);
        this.Case.ContextTags();
        Thread.sleep(5000);
        this.Case.Submitted();
        Thread.sleep(5000);




    }


}

