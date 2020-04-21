import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    public static WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    public void doLogin(){
        driver.get("http://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("bssatlantic.nbtctwo@gmail.com");
        driver.findElement(By.cssSelector(".RveJvd")).click();
        driver.findElement(By.name("password")).sendKeys("R0gers123");
        driver.findElement(By.id("passwordNext")).click();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}