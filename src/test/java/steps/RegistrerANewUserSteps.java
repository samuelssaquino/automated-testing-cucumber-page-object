package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.UserRegistrationPage;

import static core.DriverFactory.getDriver;
import static core.Version.getUrlVersion;

public class RegistrerANewUserSteps {

    UserRegistrationPage userRegPage = new UserRegistrationPage();

    @Given("I access the page {string}")
    public void i_access_the_page(String string) {
        getUrlVersion();
        getDriver().manage().window().maximize();
    }

    @And("I check the {string} page")
    public void i_check_the_page(String string) {
        Assertions.assertEquals(string, userRegPage.labelUserRegistration());
    }

    @Given("I check the AddUser button")
    public void i_check_the_add_user_button() {
        Assertions.assertTrue(userRegPage.verifyAddUserButtonIsDisplayed());
    }

    @Then("I click on the add user button")
    public void i_click_on_the_add_user_button() {
        userRegPage.clickAddUserButton();
    }

//    @And("I verify that the modal register is displayed")
//    public void i_verify_that_the_modal_register_is_displayed() throws InterruptedException {
//
//        WebDriverWait wait = new WebDriverWait(getDriver(), 120);
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("modalRegister")));
//
//        Assertions.assertTrue(userRegPage.verifyModalRegisterIsDisplayed());
//    }

    @Then("I enter the field first name with {string} and field last name with {string}")
    public void i_enter_the_field_first_name_with_and_field_last_name_with(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("I enter the other fields with valid data")
    public void i_enter_the_other_fields_with_valid_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click the save button")
    public void i_click_the_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The application should display the message {string}")
    public void the_application_should_display_the_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("The application should display the registered user in the list")
    public void the_application_should_display_the_registered_user_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
