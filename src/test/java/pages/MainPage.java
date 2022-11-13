package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            buttonEnter = $$(".un_logined").get(0),
            buttonRegister = $$(".un_logined").get(1);

    @Step("Open Authorization Form")
    public MainPage openAuthorizationForm() {
        open("/ru/games/neverwinter");
        buttonEnter.click();
        return this;
    }
    @Step("Open Registration Form")
    public MainPage openRegistrationForm() {
        open("/ru/games/neverwinter");
        buttonRegister.click();
        return this;
    }
}
