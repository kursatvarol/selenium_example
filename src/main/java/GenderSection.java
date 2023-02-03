import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage {

    private final By maleLabelLocator = By.cssSelector("label[for=\"gender-radio-1\"]");
    private final By femaleLabelLocator = By.cssSelector("label[for=\"gender-radio-2\"]");
    private final By otherLabelLocator = By.cssSelector("label[for=\"gender-radio-3\"]");
    
    private final By maleRadioButtonLocator = new By.ById("gender-radio-1");
    private final By femaleRadioButtonLocator = new By.ById("gender-radio-2");
    private final By otherRadioButtonLocator = new By.ById("gender-radio-3");

    public enum Genders {MALE , FEMALE , OTHER}


    public GenderSection(WebDriver driver) {
        super(driver);

    }

    public void clickRadioButton(Genders gender){
        switch (gender){
            case MALE:
                click(maleRadioButtonLocator);
                break;
            case FEMALE:
                click(femaleRadioButtonLocator);
                break;
            case OTHER:
                click(otherRadioButtonLocator);
                break;
        }

    }

    public boolean isRadioButtonChecked(Genders gender){
        boolean isChecked = false;
        switch (gender){
            case FEMALE:
                isChecked = isSelected(femaleRadioButtonLocator);
                break;
            case MALE:
                isChecked = isSelected(maleRadioButtonLocator);
                break;
            case OTHER:
                isChecked = isSelected(otherRadioButtonLocator);
                break;

        }
        return isChecked;

    }
}
