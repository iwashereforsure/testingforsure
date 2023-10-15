import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Link_Test extends TestBase {
    @Test
    void goBackAndForce() {

        String links = "https://demoqa.com/links";
        page.navigate(links);

        Locator home = page.locator("#simpleLink");
        Locator homexHXiq = page.locator("#dynamicLink");
        Locator created = page.locator("#created");
        Locator no_Content = page.locator("#no-content");
        Locator moved = page.locator("#moved");
        Locator bad_Request = page.locator("#bad-request");
        Locator unauthorized = page.locator("#unauthorized");
        Locator forbidden = page.locator("#forbidden");
        Locator not_Found = page.locator("#invalid-url");


        home.click();

        // Get the list of all pages (tabs)
        List<Page> pages = context.pages();

        // Assuming the newly opened tab is the last in the list (most rightward one by default), close it
        if (pages.size() > 1) {
            pages.get(pages.size() - 1).close();
        }

        /*
        Due to the nature of the code a timeout is introduced so one can observe the code working,
        else it would look like it just close the tab and open another one real fast
        */
        page.waitForTimeout(2000);

        homexHXiq.click();

        pages = context.pages();

        if (pages.size() > 1) {
            pages.get(pages.size() - 1).close();
        }

        // Read the timeout above
        page.waitForTimeout(2000);

        created.click();
        no_Content.click();
        moved.click();
        bad_Request.click();
        unauthorized.click();
        forbidden.click();
        not_Found.click();
    }
}