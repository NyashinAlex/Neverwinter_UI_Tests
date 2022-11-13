package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

    private final SelenideElement
            fieldEmail = $("#username-body"),
            fieldPassword = $("#password-body-in"),
            buttonEnter = $("#js_sign_in_body");

    @Step("form filling with Email and Password")
    public AuthorizationPage formFillingWithEmailAndPassword(String email, String password) {
        fieldEmail.setValue(email);
        fieldPassword.setValue(password);
        return this;
    }

    @Step("authorization click Enter")
    public AuthorizationPage authorizationClickEnter() {
        buttonEnter.click();
        return this;
    }
}
