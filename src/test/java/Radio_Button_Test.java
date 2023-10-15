import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Radio_Button_Test extends TestBase {
    @Test
    void goBackAndForce() {

        // Navigate to a URL
        String radioButton = "https://demoqa.com/radio-button";
        page.navigate(radioButton);

        Locator yes_radio = page.locator("label[for='yesRadio']");
        Locator impressive_radio = page.locator("label[for='impressiveRadio']");
        Locator no_radio = page.locator("label[for='noRadio']");

        // Check if the 'No' radio button is disabled before interacting with other radio buttons
        boolean isNoRadioDisabledBeforeInteractions = no_radio.getAttribute("class").contains("disabled");
        assertTrue(isNoRadioDisabledBeforeInteractions, "The 'No' radio button should be disabled before interacting with other radio buttons.");

        // Click the 'Yes' radio button
        yes_radio.click();

        // Check the 'No' radio button after clicking 'Yes'
        boolean isNoRadioDisabledAfterYes = no_radio.getAttribute("class").contains("disabled");
        assertTrue(isNoRadioDisabledAfterYes, "The 'No' radio button should be disabled after clicking 'Yes'.");

        // Click the 'Impressive' radio button
        impressive_radio.click();

        // Check the 'No' radio button after clicking 'Impressive'
        boolean isNoRadioDisabledAfterImpressive = no_radio.getAttribute("class").contains("disabled");
        assertTrue(isNoRadioDisabledAfterImpressive, "The 'No' radio button should be disabled after clicking 'Impressive'.");
    }
}
