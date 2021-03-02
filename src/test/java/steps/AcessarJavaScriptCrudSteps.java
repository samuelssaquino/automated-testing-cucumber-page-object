package steps;

import core.DriverFactory;
import core.Version;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import pages.UserRegistrationPage;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;
import static core.Version.getUrlVersion;

public class AcessarJavaScriptCrudSteps {

    UserRegistrationPage userRegPage = new UserRegistrationPage();

    @Given("eu acesso a pagina do Java Script CRUD")
    public void eu_acesso_a_pagina_do_java_script_crud() {
        getUrlVersion();
        getDriver().manage().window().maximize();
    }

    @Given("verifico que o label {string}")
    public void verifico_que_o_label(String userRegistration) {
        Assertions.assertEquals(userRegistration, userRegPage.labelUserRegistration());
        killDriver();
    }
}
