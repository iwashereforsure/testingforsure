import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

public class Text_Box_Test extends TestBase{
    @Test
    void goBackAndForce() {

        // Navigate to a URL
        String text_box = "https://demoqa.com/text-box";
        page.navigate(text_box);

        // Web elements (locators)
        Locator namebox = page.getByPlaceholder("Full Name");
        Locator email = page.getByPlaceholder("name@example.com");
        Locator currentaddress = page.getByPlaceholder("Current Address");
        Locator permanentaddress = page.locator("#permanentAddress");
        Locator submituser = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit"));

        // Interactions with different web elements:

        // Information about user
        namebox.fill("Yesman Gunner");
        email.fill("Yesmangunner123@themail.com");
        currentaddress.fill("somewhere in the wild 3rd street");
        permanentaddress.fill("This is my permanent address.");
        submituser.click();
    }
}
