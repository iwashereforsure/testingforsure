import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.Test;

public class Dynamic_Properties_Test extends TestBase {
    @Test
    void goBackAndForce() {
        String dynamicProperties = "https://demoqa.com/dynamic-properties";
        page.navigate(dynamicProperties);

        Locator enableAfterButtonLocator = page.locator("#enableAfter");

        // Check if the button is enabled before waiting
        boolean isEnabledBefore = enableAfterButtonLocator.isEnabled();

        // Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the button is enabled after waiting
        boolean isEnabledAfter = enableAfterButtonLocator.isEnabled();

        // Output the results
        System.out.println("Button enabled before 5 seconds: " + isEnabledBefore);
        System.out.println("Button enabled after 5 seconds: " + isEnabledAfter);

        // If the button is enabled after 5 seconds, click it
        if (isEnabledAfter) {
            enableAfterButtonLocator.click();
        }
    }
}
