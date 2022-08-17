package ScriptsMentee.SurveyStyle;


import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SurveyStyleTest {


    private SurveyStylePage SurveyStyle;

    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.SurveyStyle = new SurveyStylePage();
    }

    @AfterEach
    public void afterEach() throws ATUTestRecorderException {
        this.SurveyStyle.close();
    }

    @Test
    public void ScriptSurvey() throws InterruptedException {
        this.SurveyStyle.language();
        Thread.sleep(10000);
        this.SurveyStyle.login("anderson.gomes+mentee002@go2atlas.com", "12345");
        this.SurveyStyle.submit();
        Thread.sleep(5000);
        this.SurveyStyle.SliderMenu();
        Thread.sleep(5000);
        this.SurveyStyle.UserTraits();
        Thread.sleep(5000);
        this.SurveyStyle.Style();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment1();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment2();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment3();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment4();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment5();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment6();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment7();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment8();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment9();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment10();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment11();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment12();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment13();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment14();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment15();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment16();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment17();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment18();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment19();
        Thread.sleep(5000);
        this.SurveyStyle.AnchorAssessment20();
        Thread.sleep(5000);
        this.SurveyStyle.Submitted();
        Thread.sleep(10000);




    }


}


