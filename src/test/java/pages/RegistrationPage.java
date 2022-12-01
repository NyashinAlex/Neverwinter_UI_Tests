package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private final SelenideElement
            fieldEmail = $("#email-body"),
            fieldNickname = $("#display-body"),
            buttonForward = $(".button-container .btn-sign-up"),
            fieldPassword = $("#password-body"),
            fieldPasswordRepeat = $("#confirm-body"),
            selectBirthDay = $(".birth-day-register"),
            selectBirthMonth = $(".birth-month-register"),
            selectBirthYear = $(".birth-year-register"),
            checkBoxAgree = $("#tos-body"),
            checkBoxFacebook = $("#facebook-advertising"),
            checkBoxMail = $("#mail-body"),
            buttonRegister = $(".btn-main-full");

    @Step("Registration PC")
    public RegistrationPage registrationPC(String email, String nickname, String password, String passwordRepeat, int birthDay, int birthMonth, int birthYear) {
        fieldEmail.setValue(email);
        fieldNickname.setValue(nickname);
        sleep(1000);
        buttonForward.click();

        fieldPassword.setValue(password);
        fieldPasswordRepeat.setValue(passwordRepeat);
        selectBirthDay.selectOption(birthDay);
        selectBirthMonth.selectOption(birthMonth);
        selectBirthYear.click();
        $("[value = '" + birthYear + "']").click();
        selectBirthYear.click();
        checkBoxAgree.click();
        checkBoxFacebook.click();
        checkBoxMail.click();
        buttonRegister.click();
        return this;
    }
}
