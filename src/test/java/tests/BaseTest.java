package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import helper.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    Faker faker = new Faker();

    String email, nickname, password;

    @BeforeAll
    static void openMainPage() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.warframe.com";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }

    @BeforeEach
    void generationDate() {
        email = faker.internet().emailAddress();
        nickname = faker.funnyName().name();
        password = faker.internet().password(8, 25);
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
