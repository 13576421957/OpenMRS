package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class _03_ValidateLocationFunctionality {

    WebDriver driver;

    @Given("Navigate to OpenMRS Website")
    public void navigate_to_OpenMRS_Website() {

        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");


        driver = new ChromeDriver();


        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        System.out.println("Navigating to OpenMRS Website");
    }

    @Given("Enter valid username into the {string} field")
    public void enter_valid_username(String field) {

        WebElement usernameField = driver.findElement(By.id("Username"));
        usernameField.sendKeys("your_username");
        System.out.println("Entering valid username into the " + field + " field");
    }

    @Given("Enter valid password into the {string} field")
    public void enter_valid_password(String field) {

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("your_password");
        System.out.println("Entering valid password into the " + field + " field");
    }

    @Given("Select {string}")
    public void select_location(String location) {

        WebElement locationElement = driver.findElement(By.id("location"));
        locationElement.sendKeys(location);
        System.out.println("Selecting " + location + " ");
    }

    @When("Click on the login button")
    public void click_on_the_login_button() {

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
        System.out.println("Clicking on the login button");
    }
}

