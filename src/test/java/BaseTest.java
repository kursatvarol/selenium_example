import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {

    protected WebDriver driver;
    // static String browser = System.getProperty("browser");

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        // driver = new ChromeDriver();
        System.out.println("Test Initiated");
    }

    @BeforeEach
    public void beforeMethod(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void afterMethod() {
        driver.quit();
    }

    @AfterAll
    public static void tearDown(){
        // driver.quit();
        System.out.println("Test Finished");


    }


}
