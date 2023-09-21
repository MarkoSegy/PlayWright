import org.junit.jupiter.api.Test;
import pages.AccountEntries;

public class SignUptest extends PlaywrightRunner{

    @Test
    public  void signUpTest(){
        page.navigate("https://bestbuy.com/?intl=nosplash");



        accountNavigationPage.navigateTo(AccountEntries.CREATE_ACCOUNT);
        //createAccountPage.createAccount();
    }
}
