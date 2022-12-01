package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import helper.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    Faker faker = new Faker();

    String email, nickname, password, passwordDifferent;
    int birthDay, birthMonth, birthYear, birthYearUnder13;

    @BeforeAll
    static void openMainPage() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.arcgames.com";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }

    @BeforeEach
    void generationDate() {
        email = faker.internet().emailAddress();
        nickname = faker.name().firstName();
        password = "N" + faker.internet().password(8, 13);
        passwordDifferent = "N" + faker.internet().password(8, 13);
        birthDay = faker.number().numberBetween(1,28);
        birthMonth = faker.number().numberBetween(1,12);
        birthYear = faker.number().numberBetween(1990,2009);
        birthYearUnder13= faker.number().numberBetween(2010,2022);
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Selenide.closeWebDriver();
    }
}
