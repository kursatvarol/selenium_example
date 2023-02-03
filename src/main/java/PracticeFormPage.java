import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage {

    private WebDriver driver;
    private final By nameLocator = By.cssSelector("#firstName");
    private final By LastNameLocator = By.cssSelector("#lastName");
    private final By emailLocator = By.cssSelector("#userEmail");

    private GenderSection genderSection;

    public PracticeFormPage(WebDriver driver){
        super(driver);
        driver.get(baseURL.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }

    public GenderSection genderSection(){
        return this.genderSection;
    }

    public void setName(String name){
       type(nameLocator,name);

    }

    public void setLastName(String lastName ){
        type(LastNameLocator , lastName);

    }

    public void setEmail(String mailAddress){
        type(emailLocator,mailAddress);


    }

    public String getName(){
      return find(nameLocator).getAttribute("value");

    }

    public String getlastName(){
       return find(LastNameLocator).getAttribute("value");

    }

    public String getEmail(){
        return find(emailLocator).getAttribute("value");
    }


}
