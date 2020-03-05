package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    //Para saber dónde está el ejecutable
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        //PARA TAMAÑO PERSONALIZADO
        //driver.manage().window().setSize(new Dimension(400, 838));

        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]) {

        BaseTests test = new BaseTests();
        test.setUp();
    }
}
