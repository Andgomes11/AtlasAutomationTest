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
        Thread.sleep(10000);
        this.Skills.SurveySkills();
        Thread.sleep(10000);
        this.Skills.SelectorSkills1();
        Thread.sleep(2000);
        this.Skills.SelectorSkills2();
        Thread.sleep(2000);
        this.Skills.SelectorSkills3();
        Thread.sleep(2000);
        this.Skills.SelectorSkills4();
        Thread.sleep(2000);
        this.Skills.SelectorSkills5();
        Thread.sleep(2000);
        this.Skills.SelectorSkills6();
        Thread.sleep(2000);
        this.Skills.SelectorSkills7();
        Thread.sleep(2000);
        this.Skills.SelectorSkills8();
        Thread.sleep(2000);
        this.Skills.SelectorSkills9();
        Thread.sleep(2000);
        this.Skills.SelectorSkills10();
        Thread.sleep(2000);
        this.Skills.SelectorSkills11();
        Thread.sleep(2000);
        this.Skills.SelectorSkills12();
        Thread.sleep(2000);
        this.Skills.SelectorSkills13();
        Thread.sleep(2000);
        this.Skills.SelectorSkills14();
        Thread.sleep(2000);
        this.Skills.SelectorSkills15();
        Thread.sleep(2000);
        this.Skills.SelectorSkills16();
        Thread.sleep(2000);
        this.Skills.SelectorSkills17();
        Thread.sleep(2000);
        this.Skills.SelectorSkills18();
        Thread.sleep(2000);
        this.Skills.SelectorSkills19();
        Thread.sleep(2000);
        this.Skills.SelectorSkills20();
        Thread.sleep(2000);
        this.Skills.SelectorSkills21();
        Thread.sleep(2000);
        this.Skills.SelectorSkills22();
        Thread.sleep(2000);
        this.Skills.SelectorSkills23();
        Thread.sleep(2000);
        this.Skills.SelectorSkills24();
        Thread.sleep(2000);
        this.Skills.SelectorSkills25();
        Thread.sleep(2000);
        this.Skills.SelectorSkills26();
        Thread.sleep(2000);
        this.Skills.SelectorSkills27();
        Thread.sleep(2000);
        this.Skills.SelectorSkills28();
        Thread.sleep(2000);
        this.Skills.SelectorSkills29();
        Thread.sleep(2000);
        this.Skills.SelectorSkills30();
        Thread.sleep(2000);
        this.Skills.SelectorSkills31();
        Thread.sleep(2000);
        this.Skills.SelectorSkills32();
        Thread.sleep(2000);
        this.Skills.Submit();
        Thread.sleep(10000);
        this.Skills.LeadsSend();
        Thread.sleep(10000);
    }
}
