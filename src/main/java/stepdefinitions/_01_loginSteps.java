package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Dialog;
import utilities.DriverClass;

public class _01_loginSteps {
    @Given("Navigate to OpenMRS Website")
    public void navigate_to_open_mrs_website() {
        DriverClass.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");

    }
    @Given("Enter valid username into the {string} field")
    public void enter_valid_username_into_the_field(String string, Dialog dialog) {
        dialog.waitUntilVisible(dialog.username);
        dialog.username.sendKeys("Admin");

    }
    @Given("Enter valid password in to the {string} field")
    public void enter_valid_password_in_to_the_field(String string) {
        Dialog dialog;
        dialog.waitUntilVisible(dialog.username);
        dialog.password.sendKeys("Admin123");

    }
    @When("Click on the login button")
    public void click_on_the_login_button() {
        Dialog dialog;
        dialog.loginButton.click();

    }
    @Then("Should not able to login")
    public void should_not_able_to_login() {
        menu.waitUntilVisible(menu.dashBoardTitle);
        Assert.assertTrue(menu.dashBoardTitle.isDisplayed());
    }


    }




}





