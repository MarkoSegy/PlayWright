import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.LocatorAssertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class FirstTest extends PlaywrightRunner {

    @Test
    public void firstTest(){
        page.navigate("https://bestbuy.com/?intl=nosplash");

        Locator dealOfTheDay = page.locator("//a[text()='Deal of the Day']");
        assertThat(dealOfTheDay).hasText("Deal of the Day"); // Assertions
        assertThat(dealOfTheDay).containsText("HHH",new LocatorAssertions.ContainsTextOptions().setTimeout(2000)); // Set TimeOut

    }
}
