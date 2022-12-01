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
        registrationPage.registrationPC(email, nickname, password, password, birthDay, birthMonth, birthYear);

        $("#notification-list").shouldBe(text("Поздравляем! Ваша учетная запись была успешно создана."));
    }

    @Test
    @DisplayName("Unsuccessful registration from PС - user under 13")
    void unsuccessfulRegistrationPCUserUnder13() {
        mainPage.openRegistrationForm();
        registrationPage.registrationPC(email, nickname, password, password, birthDay, birthMonth, birthYearUnder13);

        $(".status-container.error-message.error").shouldBe(text("Услуги не предоставляются лицам моложе 13."));
    }

    @Test
    @DisplayName("Unsuccessful registration from PС - different password")
    void unsuccessfulRegistrationPCDifferentPassword() {
        mainPage.openRegistrationForm();
        registrationPage.registrationPC(email, nickname, password, passwordDifferent, birthDay, birthMonth, birthYear);

        $(".status-container.error-message.error").shouldBe(text("Введенный пароль не соответствует паролю, введенному выше. Вырезание, копирование и вставка введенного выше пароля приведет к ошибке."));
    }
}