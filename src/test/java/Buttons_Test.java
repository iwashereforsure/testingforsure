import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.MouseButton;
import org.junit.jupiter.api.Test;

public class Buttons_Test extends TestBase {

    @Test
    void goBackAndForce() {

        //Navigate to a URL
        String buttons = "https://demoqa.com/buttons";
        page.navigate(buttons);

        Locator doubleClickMe = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Double Click Me"));

        Locator rightClickMe = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Right Click Me"));

        Locator clickMe = page.locator("(//button[normalize-space()='Click Me'])[1]");

        doubleClickMe.dblclick();

        // Right-click the "Right Click Me" button
        rightClickMe.click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));

        clickMe.click();
    }
}
