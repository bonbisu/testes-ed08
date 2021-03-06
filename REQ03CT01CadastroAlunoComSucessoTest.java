// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class REQ03CT01CadastroAlunoComSucessoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void rEQ03CT01CadastroAlunoComSucesso() {
    driver.get("https://ts-scel.herokuapp.com/login");
    driver.manage().window().setSize(new Dimension(1265, 975));
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("maria");
    driver.findElement(By.name("password")).sendKeys("456");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.linkText("Alunos")).click();
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("9642");
    driver.findElement(By.id("nome")).sendKeys("Fulano");
    driver.findElement(By.id("email")).sendKeys("fulano@fatec.sp.gov.br");
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.id("nome")).sendKeys("ciclano");
    driver.findElement(By.cssSelector(".row:nth-child(4) > .form-group")).click();
    driver.findElement(By.id("email")).sendKeys("ciclano@fatec.sp.gov.br");
    driver.findElement(By.cssSelector(".row:nth-child(2) > .col-md-8:nth-child(1)")).click();
    driver.findElement(By.id("cep")).click();
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.id("cep")).sendKeys("03276110");
    driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
  }
}
