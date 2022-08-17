package ScriptsMentee.SurveyMotivator;


import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SurveyMotivatorsTest {


    private SurveyMotivatorsPage SurveyMotivator;

    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.SurveyMotivator = new SurveyMotivatorsPage();
    }

    @AfterEach
    public void afterEach() throws ATUTestRecorderException {
        this.SurveyMotivator.close();
    }

    @Test
    public void ScriptMotivators() throws InterruptedException {
        this.SurveyMotivator.language();
        Thread.sleep(5000);
        this.SurveyMotivator.login("anderson.gomes+mentee002@go2atlas.com", "12345");
        this.SurveyMotivator.submit();
        Thread.sleep(5000);
        this.SurveyMotivator.SliderMenu();
        Thread.sleep(5000);
        this.SurveyMotivator.UserTraits();
        Thread.sleep(5000);
        this.SurveyMotivator.Motivators();
        Thread.sleep(5000);
        this.SurveyMotivator.AnchorAssessment1();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment2();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment3();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment4();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment5();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment6();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment7();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment8();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment9();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment10();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment11();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment12();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment13();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment14();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment15();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment16();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment17();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment18();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment19();
        Thread.sleep(2000);
        this.SurveyMotivator.AnchorAssessment20();
        Thread.sleep(2000);
        this.SurveyMotivator.Submitted();
        Thread.sleep(10000);
    }


}


