package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AuthorizationPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTests extends BaseTest{

    MainPage mainPage = new MainPage();
    AuthorizationPage authorizationPage = new AuthorizationPage();

    @Test
    @DisplayName("Unsuccessful authorization with email and password")
    void unsuccessfulAuthorizationWithEmailAndPassword() {
        mainPage.openAuthorizationForm();
        authorizationPage.formFillingWithEmailAndPassword(email, password)
                .authorizationClickEnter();

        $(".status-container.error-message.error").should(text("Неверное имя пользователя или пароль. Попробуйте еще раз."));
    }
}