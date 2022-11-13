package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

    private final SelenideElement
            buttonPS = $$(".consoleLoginBtns a").get(0),
            buttonXbox = $$(".consoleLoginBtns a").get(1),
            buttonSwitch= $$(".consoleLoginBtns a").get(2),
            fieldEmail = $("#loginForm [name=\"email\"]"),
            fieldPassword = $("#loginForm [name=\"password\"]"),
            buttonEnter = $("#submit-login .button-wrap");

    public AuthorizationPage clickButtonAuthorizationFromPS() {
        buttonPS.click();
        return this;
    }

    public AuthorizationPage clickButtonAuthorizationFromXbox() {
        buttonXbox.click();
        return this;
    }

    public AuthorizationPage clickButtonAuthorizationFromSwitch() {
        buttonSwitch.click();
        return this;
    }

    public AuthorizationPage formFillingWithEmailAndPassword(String email, String password) {
        fieldEmail.setValue(email);
        fieldPassword.setValue(password);
        sleep(5000);
        return this;
    }

    public AuthorizationPage authorizationClickEnter() {
        buttonEnter.click();
        return this;
    }
}
