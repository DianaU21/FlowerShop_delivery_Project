import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void Setup(){
        driver = new ChromeDriver();
        driver.get("https://www.livrarefloribucuresti.ro");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        if(driver!=null)
        {
            driver.quit();
        }
    }
}
