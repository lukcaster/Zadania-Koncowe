import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class PHPTravelsTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
    }
        @Test
        public void PHPTravelBookingTest() throws InterruptedException {
        //Select Flights
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a")).click();
         //Select Round Trip
            driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[2]")).click();
         //Select Airports
            String firstAirport = "warsaw";
            WebElement firstAirportWebElement;
            //Actions actions = new Actions(driver);
            //WebElement target = driver.findElement(By.className("select2-input"));
            //actions.moveToElement(target).perform();
            driver.findElement(By.name("origin")).click();
            firstAirportWebElement = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]"));
            firstAirportWebElement.sendKeys(firstAirport);
            Thread.sleep(3000);
            Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")).isEnabled());
            driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")).click();
            String secondAirport = "New york";
            WebElement secondAirportWebElement;
            secondAirportWebElement = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input"));
            secondAirportWebElement.sendKeys(secondAirport);
            Thread.sleep(3000);
            Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]")).isEnabled());
            driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]")).click();

        }


}
