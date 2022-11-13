package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement
            buttonEnter = $(".HeaderNavigationBar-controlsContainer .Button.Button--secondary"),
            buttonPlayFreeNow = $(".HeaderNavigationBar-controlsContainer .Button.Button--primary");

    public MainPage openAuthorizationForm() {
        open("/ru");
        buttonEnter.click();
        return this;
    }

    public MainPage openRegistrationForm() {
        open("/ru");
        buttonPlayFreeNow.click();
        return this;
    }
}
