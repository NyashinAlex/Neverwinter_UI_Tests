package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTests extends BaseTest {

    MainPage mainPage = new MainPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @DisplayName("Success registration from PС")
    void successRegistrationPC() {
        mainPage.openRegistrationForm();
        registrationPage.registrationPC(email, nickname, password, birthDay, birthMonth, birthYear);

        $(".alert.alert-danger").shouldBe(text("THE G-RECAPTCHA-RESPONSE FIELD IS REQUIRED."));
    }
}