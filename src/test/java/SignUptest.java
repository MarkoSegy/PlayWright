import org.junit.jupiter.api.Test;

public class SignUptest extends PlaywrightRunner{

    @Test
    public  void signUpTest(){
        page.navigate("https://bestbuy.com/?intl=nosplash");

        page.locator("button[data-lid='hdr_signin']").click();
        page.locator("div.header-guest-user a.create-account-btn").click();

        createAccountPage.createAccount();

    }
}
