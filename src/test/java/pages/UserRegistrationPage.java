package pages;

import core.DSL;
import org.openqa.selenium.WebElement;

public class UserRegistrationPage {

    private DSL dsl;

    public UserRegistrationPage() {
        dsl = new DSL();
    }


    public String labelUserRegistration() {
        return dsl.obterTextoCSS("h2");
    }

    public boolean verifyAddUserButtonIsDisplayed() {
        return dsl.getButtonIsDisplayed("btnAddUser");
    }

    public void clickAddUserButton() {
        dsl.clicarBotao("btnAddUser");
    }

//    public boolean verifyModalRegisterIsDisplayed() {
//        return dsl.getTextIsDisplayed("modalRegister");
//    }
}
