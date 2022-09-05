package UserNonAuthenticated.SurveySkillsAndKnowLedge;



import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SurveySkillsAndKnowledgeTest {
    private SurveySkillsAndKnowledgePage Skills;

    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.Skills = new SurveySkillsAndKnowledgePage();
    }
    @AfterEach
    public void afterEach() throws ATUTestRecorderException {
        this.Skills.close();
    }

    @Test
    public void FindCareer() throws InterruptedException {
        Thread.sleep(5000);
        this.Skills.language();
        Thread.sleep(5000);
        this.Skills.findCareer();
        Thread.sleep(15000);
        this.Skills.SelectorSkills();
        Thread.sleep(2000);
        this.Skills.RadioButton();
        Thread.sleep(2000);
        this.Skills.Submitted();
        Thread.sleep(10000);
        this.Skills.Continue();
        Thread.sleep(10000);

    }
}
