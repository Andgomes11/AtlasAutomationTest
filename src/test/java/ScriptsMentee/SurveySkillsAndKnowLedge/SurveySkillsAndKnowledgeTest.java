package ScriptsMentee.SurveySkillsAndKnowLedge;



import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SurveySkillsAndKnowledgeTest {
    private SurveySkillsAndKnowledgePage Skills;

    @BeforeEach
    public void beforeEach() throws ATUTestRecorderException {
        this.Skills = new SurveySkillsAndKnowledgePage();
    }
   // @AfterEach
    public void afterEach() throws ATUTestRecorderException {
        this.Skills.close();
    }

    @Test
    public void SurveySkills() throws InterruptedException {
        Thread.sleep(10000);
        this.Skills.language();
        Thread.sleep(5000);
        this.Skills.login("anderson.gomes+mentee002@go2atlas.com", "12345");
        Thread.sleep(2000);
        this.Skills.submit();
        Thread.sleep(5000);
        this.Skills.SliderMenu();
        Thread.sleep(5000);
        this.Skills.UserTraits();

    }
}
