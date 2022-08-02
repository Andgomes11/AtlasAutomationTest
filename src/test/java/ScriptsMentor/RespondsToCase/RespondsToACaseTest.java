package ScriptsMentor.RespondsToCase;


import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RespondsToACaseTest {
    private ReplyCasePage Responds;


    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.Responds = new ReplyCasePage();

    }

    @AfterEach
    public void afterEach() throws ATUTestRecorderException {
        this.Responds.close();
    }

    @Test
    public void Responds() throws InterruptedException {
        this.Responds.login("anderson.gomes+mentor001@go2atlas.com", "123456");
        this.Responds.submit();
        this.Responds.WaitForLoading();
        this.Responds.ChooseCase();
        this.Responds.WaitForLoading();
        this.Responds.CaseResponseTitle();
        this.Responds.CaseResponseDescription();
        this.Responds.RiskLevel();
        Thread.sleep(5000);
        this.Responds.RiskComments();
        Thread.sleep(5000);
        this.Responds.EffortLevel();
        Thread.sleep(5000);
        this.Responds.EffortComments();
        Thread.sleep(5000);
        this.Responds.CostLevel();
        Thread.sleep(5000);
        this.Responds.CostComments();
        Thread.sleep(5000);
        this.Responds.SubmitComments();
        Thread.sleep(5000);
    }







}