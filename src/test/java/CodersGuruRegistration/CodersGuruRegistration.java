package CodersGuruRegistration;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class CodersGuruRegistration {
    private ChromeDriver driver;

    private String firstName ="";
    private String lastName ="";
    private String email ="";
    private String password ="";
    private String town ="";
    private String zipCode ="";
    private String street = "";
    private String houseAppartamentNumber ="";


    @Given("^Web Browser is open with https://tester\\.codersguru\\.pl/$")
    public void webBrowserIsOpenWithHttpsTesterCodersguruPl() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://tester.codersguru.pl/");
    }

    @When("^User Selects button called Załóż Konto$")
    public void userSelectsButtonCalledZałóżKonto() {

        WebElement element;
        driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]")).click();

    }


    @And("^User is on the register page and selects Prywatnie button$")
    public void userIsOnTheRegisterPageAndSelectsPrywatnieButton() {
        driver.findElement(By.xpath("//*[@id=\"person\"]")).click();
    }

    @And("^User Fills Email input field$")
    public void userFillsEmailInputField() {
        String[] firstNameInputField = {"Janusz", "Marian", "Radek", "Dobromir"};
        Random random = new Random();
        int randomName = random.nextInt(3);
        firstName = firstNameInputField[randomName];
        String[] lastNameInputField = {"Mistrz", "Niski", "Wysoki", "Sredni"};
        int randomLastName = random.nextInt(3);
        lastName = lastNameInputField[randomLastName];
        int emailNumber = random.nextInt(1000);
        email = firstName + "." + lastName + emailNumber + "@gmail.com";
        WebElement emailWebElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_email\"]"));
        emailWebElement.sendKeys(email);
    }

    @And("^User Fills First Name field$")
    public void userFillsFirstNameField() {
        WebElement firstNameWebElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_name\"]"));
        firstNameWebElement.sendKeys(firstName);
    }

    @And("^User Fills Last Name field$")
    public void userFillsLastNameField() {
        WebElement lastNameWebElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_lastname\"]"));
        lastNameWebElement.sendKeys(lastName);
    }


    @And("^User Fills Password field with not shorter password than five letters$")
    public void userFillsPasswordFieldWithNotShorterPasswordThanFiveLetters() {
        password = "Pass12";
        WebElement passwordWebElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_plainPassword_first\"]"));
        passwordWebElement.sendKeys(password);
    }

    @And("^User Fills Repeat Password field with not shorter password than five letters$")
    public void userFillsRepeatPasswordFieldWithNotShorterPasswordThanFiveLetters() {
        WebElement passwordConfirmWebElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_plainPassword_second\"]"));
        passwordConfirmWebElement.sendKeys(password);
    }

    @And("^User Fills Town Field$")
    public void userFillsTownField() {
        town = "Kraków";
        WebElement townWebElement = driver.findElement(By.xpath("//*[@id=\"form_city\"]"));
        townWebElement.sendKeys(town);
    }

    @And("^User Fills Zip-Code Field maintaining the correct format$")
    public void userFillsZipCodeFieldMaintainingTheCorrectFormat() {
        zipCode = "30-355";
        WebElement zipCodeWebElement = driver.findElement(By.xpath("//*[@id=\"form_postal_code\"]"));
        zipCodeWebElement.sendKeys(zipCode);
    }

    @And("^User Fills Street Field$")
    public void userFillsStreetField() {
        street = "Długa";
        WebElement streetWebElement = driver.findElement(By.xpath("//*[@id=\"form_street\"]"));
        streetWebElement.sendKeys(street);
    }

    @And("^User Fills Number of house/apartment maintaining correct format$")
    public void userFillsNumberOfHouseApartmentMaintainingCorrectFormat() {
        houseAppartamentNumber = "10/44";
        WebElement houseAppartamentNumberWebElement = driver.findElement(By.xpath("//*[@id=\"form_number\"]"));
        houseAppartamentNumberWebElement.sendKeys(houseAppartamentNumber);
    }

    @And("^User Selects Field Which is called Zapoznałem się z Regulaminem$")
    public void userSelectsFieldWhichIsCalledZapoznałemSięZRegulaminem() {
        driver.findElement(By.xpath("//*[@id=\"registration-main-form\"]/div[12]/input")).click();
    }

    @And("^User Selects Button Zarejstruj$")
    public void userSelectsButtonZarejstruj() {
        driver.findElement(By.xpath("//*[@id=\"register-submit-btn\"]")).click();
    }

    @Then("^User Should be registered and back on the main page seeing Znajdź mentora button where the register button was$")
    public void userShouldBeRegisteredAndBackOnTheMainPageSeeingZnajdźMentoraButtonWhereTheRegisterButtonWas() {
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/section[3]/div/div[1]/input")).isDisplayed());
    }
}
