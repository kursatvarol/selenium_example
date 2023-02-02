import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

    private WebDriver driver;
    private final By name = By.cssSelector("#firstName");
    private final By Lastname = By.cssSelector("#lastName");
    private final By email = By.cssSelector("#userEmail");

    public PracticeFormPage(WebDriver driver){
        this.driver = driver;
    }

    public void setName(String nameAsString){
        WebElement nameSpace = driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);

    }

    public void setLastname(String lastNameAsString ){
        WebElement nameSpace = driver.findElement(Lastname);
        nameSpace.click();
        nameSpace.sendKeys(lastNameAsString);

    }

    public void setEmail(String mailAddress){
        WebElement nameSpace = driver.findElement(email);
        nameSpace.click();
        nameSpace.sendKeys(mailAddress);


    }


}
