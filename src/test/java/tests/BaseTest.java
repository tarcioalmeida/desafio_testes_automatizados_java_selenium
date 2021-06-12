package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseTest {
    public WebDriver driver;
    @BeforeClass
    public void iniciar () {
        // Caminho para o .exe ChomeDriver do selenium webdriver
        System.setProperty("webdriver.chrome.driver", "A:\\code\\testes_automatizados\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void desligar () {
        driver.quit();
    }
}