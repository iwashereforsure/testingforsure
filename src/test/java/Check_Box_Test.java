import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

public class Check_Box_Test extends TestBase{
    @Test
    void goBackAndForce() {

        String checkBox = "https://demoqa.com/checkbox";
        page.navigate(checkBox);

        Locator expandAll = page.locator("button[aria-label='Expand all'][title='Expand all']");
        Locator excelFile = page.locator("label[for='tree-node-excelFile']");
        Locator office = page.locator("label[for='tree-node-office']");
        Locator classified = page.locator("label[for='tree-node-classified']");
        Locator home = page.locator("label[for='tree-node-home']");


        expandAll.click();
        // Check the checkbox (if it's not already checked)
        if (!excelFile.isChecked()) {
            excelFile.check();
        }
        office.check();

        // Check if the checkbox is checked
        boolean isChecked = classified.isChecked();

        // If it's checked, uncheck it
        if (isChecked) {
            classified.click(); // Click to uncheck
        }
        home.check();
    }
}
