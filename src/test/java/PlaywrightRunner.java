import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.CreateAccountPage;

import java.util.Arrays;

public class PlaywrightRunner {
    protected Page page;
    protected BrowserContext browserContext;
    protected Browser browser;
    protected CreateAccountPage createAccountPage;

    protected static Playwright playwright;
    @BeforeAll
    public static  void init(){
        playwright = Playwright.create();
    }
    @BeforeEach
    public void setUp() {
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        browserContext = browser.newContext(new Browser.NewContextOptions().setPermissions(Arrays.asList("geolocation")));// Keine Geolocation verlangen
        page = browserContext.newPage();
        createAccountPage = new CreateAccountPage(page);
    }

    @AfterEach
    public void tearDown() {
        browserContext.close();
        browser.close();
    }

}
