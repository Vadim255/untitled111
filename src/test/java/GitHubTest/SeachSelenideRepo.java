package GitHubTest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SeachSelenideRepo {
    @Test
    void shouldFindSelenideRepositoryInGithub(){
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        sleep(5000);
    }
}
