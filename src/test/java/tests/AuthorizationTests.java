package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AuthorizationPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class AuthorizationTests extends BaseTest{

    MainPage mainPage = new MainPage();
    AuthorizationPage authorizationPage = new AuthorizationPage();

    @Test
    @DisplayName("Successful authorization from PS")
    void authorizationFromPS() {
        mainPage.openAuthorizationForm();
        authorizationPage.clickButtonAuthorizationFromPS();

        webdriver().shouldHave(urlContaining("https://my.account.sony.com/"));
    }

    @Test
    @DisplayName("Successful authorization from Xbox")
    void authorizationFromXbox() {
        mainPage.openAuthorizationForm();
        authorizationPage.clickButtonAuthorizationFromXbox();

        webdriver().shouldHave(urlContaining("https://login.live.com/"));
    }

    @Test
    @DisplayName("Successful authorization from Switch")
    void authorizationFromSwitch() {
        mainPage.openAuthorizationForm();
        authorizationPage.clickButtonAuthorizationFromSwitch();

        webdriver().shouldHave(urlContaining("https://accounts.nintendo.com/"));
    }

    @Test
    @DisplayName("Unsuccessful authorization with email and password")
    void unsuccessfulAuthorizationWithEmailAndPassword() {
        mainPage.openAuthorizationForm();
        authorizationPage.formFillingWithEmailAndPassword(email, password)
                .authorizationClickEnter();

        $(".alert.alert-danger").should(text("Вход в систему не удался."));
    }
}