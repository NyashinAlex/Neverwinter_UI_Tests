package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    private final SelenideElement
            platformPC = $("#signupPlatforms .signupPlat.pc"),
            platformPS = $("#signupPlatforms .signupPlat.ps4"),
            platformXbox = $("#signupPlatforms .signupPlat.xb1"),
            platformSwitch = $("#signupPlatforms .signupPlat.swi"),
            fieldEmail = $("#email"),
            fieldEmailRepeat = $("#email_confirm"),
            fieldNickname = $("#alias_f #alias"),
            fieldPassword = $("#password"),
            fieldPasswordRepeat = $("#password_confirm"),
            checkboxAgree = $("[for=\"agreed\"]"),
            buttonJoin = $(".button-wrap.uses-recaptcha");

    public RegistrationPage registrationPC(String email, String nickname, String password) {
        platformPC.click();
        fieldEmail.setValue(email);
        fieldEmailRepeat.setValue(email);
        fieldNickname.setValue(nickname);
        fieldPassword.setValue(password);
        fieldPasswordRepeat.setValue(password);
        checkboxAgree.click();
        buttonJoin.click();
        return this;
    }

    public RegistrationPage registrationPS() {
        platformPS.click();
        return this;
    }

    public RegistrationPage registrationXbox() {
        platformXbox.click();
        return this;
    }

    public RegistrationPage registrationSwitch() {
        platformSwitch.click();
        return this;
    }
}
