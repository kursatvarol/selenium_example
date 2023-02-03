import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;
    String baseURL ="https://demoqa.com/";

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();

    }

    public void type(By locator ,String text){
        find(locator).sendKeys(text);
    }

    public boolean isSelected(By locator){
        return find(locator).isSelected();
    }
}
