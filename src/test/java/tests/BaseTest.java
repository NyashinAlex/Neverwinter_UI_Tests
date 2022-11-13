package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    Faker faker = new Faker();

    String email, nickname, password;

    @BeforeAll
    static void openMainPage() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.warframe.com";
        Configuration.browser = "chrome";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }

    @BeforeEach
    void generationDate() {
        email = faker.internet().emailAddress();
        ;
        nickname = faker.funnyName().name();
        password = faker.internet().password(8, 25);
    }
}
