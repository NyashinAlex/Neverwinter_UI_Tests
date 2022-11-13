package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    Faker faker = new Faker();

    String email, nickname, password;

    @BeforeAll
    static void openMainPage() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.warframe.com";
    }

    @BeforeEach
    void generationDate(){
        email = faker.internet().emailAddress();;
        nickname = faker.funnyName().name();
        password = faker.internet().password(8,25);
    }

//    @BeforeEach
//    void closeBrowser(){
//        Selenide.closeWebDriver();
//    }
}
