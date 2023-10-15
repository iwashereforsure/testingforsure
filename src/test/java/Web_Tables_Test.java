import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.Test;

public class Web_Tables_Test extends TestBase {
    @Test
    void goBackAndForce() {

        String web_Tables = "https://demoqa.com/webtables";
        page.navigate(web_Tables);

        Locator add = page.locator("#addNewRecordButton");
        Locator first_Name = page.getByPlaceholder("First Name");
        Locator last_Name = page.getByPlaceholder("Last Name");
        Locator email = page.getByPlaceholder("name@example.com");
        Locator age = page.getByPlaceholder("Age");
        Locator salary = page.getByPlaceholder("Salary");
        Locator department = page.getByPlaceholder("Department");
        Locator submit = page.locator("#submit");
        Locator delete_1 = page.locator("#delete-record-1");
        Locator edit_3 = page.locator("#edit-record-3");

        add.click();
        first_Name.fill("Yes");
        last_Name.fill("Man");
        email.fill("yesman@themail.com");
        age.fill("99");
        salary.fill("400000");
        department.fill("Security");
        submit.click();

        delete_1.click();

        edit_3.click();
        first_Name.fill("The");
        last_Name.fill("Woman");
        email.fill("thewoman@mailforsure.com");
        age.fill("41");
        salary.fill("1000");
        department.fill("Baker");
        submit.click();
    }
}
