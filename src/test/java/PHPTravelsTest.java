import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class PHPTravelsTest {
    private WebDriver driver;
    private String firstName ="";
    private String lastName ="";
    private String email ="";
    private String passport ="";
    private String phoneNumber ="";
    private String town ="";
    private String zipCode ="";
    private String street = "";
    private String birthday ="";
    private String passportExpirationDate ="";
    private String nationality ="";
    private String creditCardNumber = "";
    private String creditCardCvvNumber ="";
    private String country = "";

    @Before
    public void setUp() throws InterruptedException {
        setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/");
        TimeUnit.SECONDS.sleep(3);
    }
        @Test
        public void PHPTravelBookingTest() throws InterruptedException, IOException, AWTException {
        //Cookies

            driver.findElement(By.xpath("//*[@id=\"usertrack-consent__button\"]")).click();

            driver.findElement(By.xpath("//*[@id=\"cookyGotItBtnBox\"]/div/button")).click();
            Actions actions = new Actions(driver);
            //WebElement target = driver.findElement(By.xpath("//*[@id=\"livechat-eye-catcher-img\"]/img"));
            //actions.moveToElement(target).perform();
            //driver.findElement(By.xpath("//*[@id=\"livechat-eye-catcher\"]/div[1]")).click();

        //Select Flights
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a")).click();
         //Select Round Trip
            driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[2]")).click();
         //Select Airports
            //Firs Airport
            String firstAirport = "warsaw";
            WebElement firstAirportWebElement;
            driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]")).click();
            firstAirportWebElement = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input"));
            firstAirportWebElement.sendKeys(firstAirport);
            WebDriverWait waitFirstAirport = new WebDriverWait(driver,20);
            WebElement firstAirportSelect = waitFirstAirport.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")));
            firstAirportSelect.click();

            //driver.findElement(By.xpath("//*[@id=\\\"select2-drop\\\"]/ul/li[2]")).click();
            //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            //Second Airport
            String secondAirport = "New york";
            WebElement secondAirportWebElement;
            driver.findElement(By.xpath("//*[@id=\"s2id_location_to\"]")).click();
            secondAirportWebElement = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input"));
            secondAirportWebElement.sendKeys(secondAirport);
            WebDriverWait waitSecondAirport = new WebDriverWait(driver, 20);
            WebElement secondAirportSelect = waitSecondAirport.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")));
            secondAirportSelect.click();
            //driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")).click();
            //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            //DAta
            //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
            TimeUnit.SECONDS.sleep(1);
            //Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[2]")).isDisplayed());
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[2]")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div[2]/div/div[1]")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div[1]/div[2]/div[27]")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[8]/div/div/div[2]/div[34]")).click();
            //Liczba osob
            String liczbaOsob ="";
            liczbaOsob = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[2]/div[3]/div/div/div[1]/div/div[2]/div/input")).getAttribute("value");
            Assert.assertEquals(liczbaOsob, "1");
            //Search button
            driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[2]/div[4]/button")).click();
            //Wybor lotu

            //if (driver.findElement(By.xpath("//*[@id=\"widget-global-so0wizh7hw\"]/div/div/div/div[3]/div[3]/button/svg")).isDisplayed()){
                //driver.findElement(By.xpath("//*[@id=\"widget-global-wkq27n2voe\"]/div/div/div/div[3]/div[3]/button/svg")).click();
            //}else{
            driver.findElement(By.xpath("//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form[1]/div[2]/div/button")).click();
            //Formularz
            //CZAT
            //Thread.sleep(2000);
            //WebElement target2 = driver.findElement(By.xpath("//*[@id=\"widget-global-wwf1fjr98go\"]/div/div/div/div[3]/div[2]/div/div[1]"));
            //actions.moveToElement(target2).perform();
            //target2.click();
            //driver.findElement(By.xpath("//*[@id=\"widget-global-o6c7f2yz6z\"]/div/div/div/div[3]/div[3]/button")).click();
            //First Name
            String[] firstNameInputField = {"Janusz", "Marian", "Radek", "Dobromir"};
            Random random = new Random();
            int randomName = random.nextInt(3);
            firstName = firstNameInputField[randomName];
            WebElement firstNameWeb = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[1]/div/input"));
            firstNameWeb.sendKeys(firstName);
            //Last Name
            String[] lastNameInputField = {"Mistrz", "Niski", "Wysoki", "Sredni"};
            int randomLastName = random.nextInt(3);
            lastName = lastNameInputField[randomLastName];
            WebElement lastNameWeb = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/input"));
            lastNameWeb.sendKeys(lastName);
            //Email
            int emailNumber = random.nextInt(1000);
            email = firstName + "." + lastName + emailNumber + "@gmail.com";
            WebElement emailWebElement = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[1]/input"));
            emailWebElement.sendKeys(email);
            WebElement emailConfirmWeb = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[2]/input"));
            emailConfirmWeb.sendKeys(email);
            //Number
            int phoneNumber1 = random.nextInt(9);
            int phoneNumber2 = random.nextInt(9);
            int phoneNumber3 = random.nextInt(9);
            int phoneNumber4 = random.nextInt(9);
            phoneNumber = phoneNumber1 + phoneNumber2 + phoneNumber4 + " - " + phoneNumber3 + phoneNumber2 + phoneNumber1 + " - " + phoneNumber4 + phoneNumber3 + phoneNumber2;
            WebElement phoneNumberWeb = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[3]/div/input"));
            phoneNumberWeb.sendKeys(phoneNumber);
            //Address
            street = "Długa";
            zipCode = "30-355";
            town = "Kraków";
            String address = street + ", " + town + zipCode;
            WebElement addressWeb = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[4]/div/input"));
            addressWeb.sendKeys(address);
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("window.scrollTo(600,600)");
           //Country
            country = "Poland";
            driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/a/span")).click();
            TimeUnit.SECONDS.sleep(1);
            WebElement countryWeb = driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/div/div/input"));
            countryWeb.sendKeys(country);
            driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/div/ul/li")).click();
            //driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/select/option[156]")).click();

            //Gender

            driver.findElement(By.xpath("//*[@id=\"title\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"title\"]/option[1]")).click();
            //First Name Billing
            driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
            WebElement firstNameWebBilling = driver.findElement(By.xpath("//*[@id=\"name\"]"));
            firstNameWebBilling.sendKeys(firstName);
            //Surname Billing
            driver.findElement(By.xpath("//*[@id=\"surname\"]")).click();
            WebElement lastNameWebBilling = driver.findElement(By.xpath("//*[@id=\"surname\"]"));
            lastNameWebBilling.sendKeys(lastName);
            //Email Billing
            driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
            WebElement emailWebBilling = driver.findElement(By.xpath("//*[@id=\"email\"]"));
            emailWebBilling.sendKeys(email);
            //Phone billing
            driver.findElement(By.xpath("//*[@id=\"phone\"]")).click();
            WebElement phoneNumberBilling = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
            phoneNumberBilling.sendKeys(phoneNumber);
            //Birthday
            driver.findElement(By.xpath("//*[@id=\"birthday\"]")).click();
            birthday = "1992-01-19";
            WebElement birthdayWeb = driver.findElement(By.xpath("//*[@id=\"birthday\"]"));
            birthdayWeb.sendKeys(birthday);
            //Passport
            driver.findElement(By.xpath("//*[@id=\"cardno\"]")).click();
            passport = phoneNumber1 + phoneNumber4 + phoneNumber3 + " - " + phoneNumber2 + phoneNumber4 + phoneNumber3 + phoneNumber1;
            WebElement passportWeb = driver.findElement(By.xpath("//*[@id=\"cardno\"]"));
            passportWeb.sendKeys(passport);
            //Passport Expiration date
            driver.findElement(By.xpath("//*[@id=\"expiration\"]")).click();
            passportExpirationDate = "2020-02-13";
            WebElement passportExpirationDateWeb = driver.findElement(By.xpath("//*[@id=\"expiration\"]"));
            passportExpirationDateWeb.sendKeys(passportExpirationDate);
            //Nationality
            driver.findElement(By.xpath("//*[@id=\"s2id_nationality\"]/a/span[1]")).click();
            WebElement nationalityWeb = driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]"));
            nationality = "Poland";
            //driver.findElement(By.xpath("//*[@id=\"s2id_nationality\"]/a")).click();
            nationalityWeb.sendKeys(nationality);
            driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li")).click();
            //CARD TYPE
            driver.findElement(By.xpath("//*[@id=\"cardtype\"]/option[2]")).click();
            //Card number
            creditCardNumber = phoneNumber1 + phoneNumber3 + "4" + phoneNumber4 + phoneNumber1 + phoneNumber2 + phoneNumber4 + phoneNumber3 + "45";
            WebElement creditCardNumberWeb = driver.findElement(By.xpath("//*[@id=\"card-number\"]"));
            creditCardNumberWeb.sendKeys(creditCardNumber);
            //Credit Card Expiration Date month
            driver.findElement(By.xpath("//*[@id=\"expiry-month\"]/option[4]")).click();
            //Credit Card Expiration Date year
            driver.findElement(By.xpath("//*[@id=\"expiry-year\"]/option[3]")).click();
            //Credit Card CVV number
            creditCardCvvNumber = phoneNumber2 + "8" + phoneNumber1;
            WebElement creditCardCvvNumberWeb = driver.findElement(By.xpath("//*[@id=\"cvv\"]"));
            creditCardCvvNumberWeb.sendKeys(creditCardCvvNumber);
            //Confimration of rules
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/form/div[5]")).click();
            //Screen potwierdzajacy
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div[1]/aside/a/div[2]")).click();
            js.executeScript("window.scrollTo(0,0)");
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "Screenshot." + format;
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div[1]/aside/a/div[2]")).click();
            js.executeScript("window.scrollTo(800,1400)");
            String fileName2 ="Screenshot2." + format;
            TimeUnit.SECONDS.sleep(1);
            new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage2 = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage2, format, new File(fileName2));
            //Availability
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"confirmBooking\"]")).click();
        }


        }
