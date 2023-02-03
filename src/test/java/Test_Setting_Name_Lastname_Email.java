import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {



    @Test
    public void setName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Kursad");
        Assertions.assertEquals("Kursad",practiceFormPage.getName(),"Name value is not correct");

    }
    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Varol");
        Assertions.assertEquals("Varol",practiceFormPage.getlastName(),"Last Name value is not correct");

    }
    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("kdjdjdjd@hotmail.com");
        Assertions.assertEquals("kdjdjdjd@hotmail.com",practiceFormPage.getEmail(),"Email value is not correct");




    }
}
