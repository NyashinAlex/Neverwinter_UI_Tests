package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class RegistrationTests extends BaseTest{

    MainPage mainPage = new MainPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @DisplayName("Open warf")
    void open() {

    }

    @Test
    @DisplayName("Success registration from PС")
    void successRegistrationPC() {
        mainPage.openRegistrationForm();
        registrationPage.registrationPC(email, nickname, password);

        $(".alert.alert-danger").shouldBe(text("THE G-RECAPTCHA-RESPONSE FIELD IS REQUIRED."));
    }

    @Test
    @DisplayName("Success registration from PS")
    void successRegistrationPS() {
        mainPage.openRegistrationForm();
        registrationPage.registrationPS();

        webdriver().shouldHave(url("https://www.playstation.com/en-us/games/warframe/"));
        $(".game-title").shouldHave(text("Warframe"));
    }

    @Test
    @DisplayName("Success registration from Xbox")
    void successRegistrationXbox() {
        mainPage.openRegistrationForm();
        registrationPage.registrationXbox();

        webdriver().shouldHave(url("https://www.xbox.com/en-us/games/store/warframe/bps3xf74b9v1?activetab=pivot%3Aoverviewtab"));
        $(".typography-module__xdsH1___zrXla.ProductDetailsHeader-module__productTitle___l-kbD").shouldHave(text("Warframe"));
    }

    @Test
    @DisplayName("Success registration from Switch")
    void successRegistrationSwitch() {
        mainPage.openRegistrationForm();
        registrationPage.registrationSwitch();

        webdriver().shouldHave(url("https://www.nintendo.com/store/products/warframe-switch/"));
        $(".Headingstyles__StyledH-sc-qpned7-0.cXdsBg.AgeGatestyles__AgeGateTitle-sc-1digegm-7.iBCMZW").shouldHave(text("Age verification"));
    }
}