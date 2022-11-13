package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement
            buttonEnter = $(".HeaderNavigationBar-controlsContainer .Button.Button--secondary"),
            buttonPlayFreeNow = $(".HeaderNavigationBar-controlsContainer .Button.Button--primary");

    @Step("Open Authorization Form")
    public MainPage openAuthorizationForm() {
        open("/forms");
        buttonEnter.click();
        return this;
    }
    @Step("Open Registration Form")
    public MainPage openRegistrationForm() {
        open("/forms");
        buttonPlayFreeNow.click();
        return this;
    }
}
