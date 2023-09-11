package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.LocatorAssertions;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CreateAccountPage {
    private final Page createAccountPage;
    public CreateAccountPage(Page page){
        this.createAccountPage = page;
    }
    public void createAccount(){
        createAccountPage.locator("input#firstName").fill("FirstName");
        createAccountPage.locator("input#lastName").fill("LastName");
        createAccountPage.locator("input#email").fill("alex@example.com");
        createAccountPage.locator("input#fld-p1").fill("1kljsOIU");
        createAccountPage.locator("input#reenterPassword").fill("1kljsOIU");

        assertThat(createAccountPage.locator("span.c-input-error-message")).containsText(
                "Your passwords march!", new LocatorAssertions.ContainsTextOptions().setTimeout(30000));

        createAccountPage.locator("input#phone").fill("0417611025");
        createAccountPage.locator("input#is-recovery-phone").check();

        assertThat(createAccountPage.locator("button.cia-form__controls__submit")).isEnabled(new LocatorAssertions.IsEnabledOptions().setTimeout(10000));


    }
}
