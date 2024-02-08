package stepdefinitions;

package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class _02_loginSteps {
    WebDriver driver; // WebDriver instance

    @Given("Navigate to OpenMRS Website")
    public void navigate_to_OpenMRS_Website() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        driver = new ChromeDriver();

        // Open the OpenMRS login page
        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        System.out.println("Navigating to OpenMRS Website...");
    }

    @Given("Enter valid username into the {string} field")
    public void enter_valid_username(String field) {
        // Code to enter a valid username into the specified field
        System.out.println("Entering valid username into the " + field + " field...");
        // Replace this line with actual code to enter username using Selenium WebDriver
    }

    @Given("Enter valid password into the {string} field")
    public void enter_valid_password(String field) {
        // Code to enter a valid password into the specified field
        System.out.println("Entering valid password into the " + field + " field...");
        // Replace this line with actual code to enter password using Selenium WebDriver
    }

    @When("Hover over the Inpatient Ward")
    public void hover_over_inpatient_ward() {
        // Code to hover over the Inpatient Ward
        hoverOverLocation("inpatient_ward");
    }

    @When("Hover over the Isolation Ward")
    public void hover_over_isolation_ward() {
        // Code to hover over the Isolation Ward
        hoverOverLocation("isolation_ward");
    }

    @When("Hover over the Outpatient Clinic")
    public void hover_over_outpatient_clinic() {
        // Code to hover over the Outpatient Clinic
        hoverOverLocation("outpatient_clinic");
    }

    @When("Hover over the Pharmacy")
    public void hover_over_pharmacy() {
        // Code to hover over the Pharmacy
        hoverOverLocation("pharmacy");
    }

    @When("Hover over the Laboratory")
    public void hover_over_laboratory() {
        // Code to hover over the Laboratory
        hoverOverLocation("laboratory");
    }

    @Then("Should see background changes")
    public void should_see_background_changes() {
        // Code to verify the background changes
        System.out.println("Verifying background changes...");
        // Replace this line with actual verification code to check for background changes using Selenium WebDriver
    }

    private void hoverOverLocation(String location) {
        // Code to hover over the specified location
        System.out.println("Hovering over " + location + "...");

        // Assuming each location has a unique ID or class for the hover action
        WebElement locationElement = driver.findElement(By.id(location)); // Replace with actual locator

        // Perform hover action using Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(locationElement).perform();
    }
}
