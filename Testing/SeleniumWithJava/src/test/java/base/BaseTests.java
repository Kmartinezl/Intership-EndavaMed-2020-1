package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);

        //driver.manage().window().fullscreen();
        //PARA TAMAÑO PERSONALIZADO
        //driver.manage().window().setSize(new Dimension(400, 838));

        //EJERCICIO 1
        /*WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());*/

        System.out.println(driver.getTitle());
        //driver.quit();
    }

    public static void main(String args[]) {

        BaseTests test = new BaseTests();
        test.setUp();
    }
}
