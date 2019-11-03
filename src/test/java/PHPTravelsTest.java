import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
        public void PHPTravelBookingTest() throws InterruptedException, IOException, AWTException {
        //Cookies
            driver.findElement(By.xpath("//*[@id=\"cookyGotItBtnBox\"]/div/button")).click();
        //Select Flights
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a")).click();
         //Select Round Trip
            driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[2]")).click();
         //Select Airports
            String firstAirport = "warsaw";
            WebElement firstAirportWebElement;
            //Actions actions = new Actions(driver);
           // WebElement target = driver.findElement(By.className("//*[@class=\"select2-drop select2-display-none select2-with-searchbox select2-drop-active\"]"));
            //actions.moveToElement(target).perform();
            driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]")).click();
            firstAirportWebElement = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input"));
            firstAirportWebElement.sendKeys(firstAirport);
            Thread.sleep(3000);
            Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")).isEnabled());
            driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")).click();
            String secondAirport = "New york";
            WebElement secondAirportWebElement;
            driver.findElement(By.xpath("//*[@id=\"s2id_location_to\"]")).click();
            secondAirportWebElement = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input"));
            secondAirportWebElement.sendKeys(secondAirport);
            Thread.sleep(3000);
            Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]")).isEnabled());
            driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]")).click();

            //DAta
            driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
            Thread.sleep(3000);
            //Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[2]")).isDisplayed());
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div[2]/div/div[1]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div[1]/div[2]/div[27]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[8]/div/div/div[2]/div[34]")).click();
            //Liczba osob
            String liczbaOsob ="";
            liczbaOsob = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[2]/div[3]/div/div/div[1]/div/div[2]/div/input")).getAttribute("value");
            Assert.assertEquals(liczbaOsob, "1");
            //Search button
            driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[2]/div[4]/button")).click();
            //Wybor lotu
            driver.findElement(By.xpath("//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form[1]/div[2]/div/button")).click();
            //Screen potwierdzajacy
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div/div[1]/aside/a/div[2]")).click();
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "Screenshot." + format;
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(fileName));

        }


        }
