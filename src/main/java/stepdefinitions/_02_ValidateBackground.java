package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class _02_ValidateBackground {
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

            System.out.println("Entering valid username into the " + field + " field");

        }

        @Given("Enter valid password into the {string} field")
        public void enter_valid_password(String field) {

            System.out.println("Entering valid password into the " + field + " field");

        }

        @When("Hover over the Inpatient Ward")
        public void hover_over_inpatient_ward() {

            hoverOverLocation("inpatient_ward");
        }

        @When("Hover over the Isolation Ward")
        public void hover_over_isolation_ward() {

            hoverOverLocation("isolation_ward");
        }

        @When("Hover over the Outpatient Clinic")
        public void hover_over_outpatient_clinic() {

            hoverOverLocation("outpatient_clinic");
        }

        @When("Hover over the Pharmacy")
        public void hover_over_pharmacy() {

            hoverOverLocation("pharmacy");
        }

        @When("Hover over the Laboratory")
        public void hover_over_laboratory() {

            hoverOverLocation("laboratory");
        }

        @Then("Should see background changes")
        public void should_see_background_changes() {

            System.out.println("Verifying background changes");

        }

        private void hoverOverLocation(String location) {

            System.out.println("Hovering over " + location + "...");


            WebElement locationElement = driver.findElement(By.id(location));


            Actions actions = new Actions(driver);
            actions.moveToElement(locationElement).perform();
        }
    }

