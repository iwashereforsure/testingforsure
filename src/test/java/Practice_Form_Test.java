import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

public class Practice_Form_Test extends TestBase{
    @Test
    void goBackAndForce() {


        String practice_form = "https://demoqa.com/automation-practice-form";
        page.navigate(practice_form);

        Locator firstName = page.getByPlaceholder("First Name");
        Locator lastName = page.getByPlaceholder("Last Name");
        Locator email = page.getByPlaceholder("name@example.com");
        Locator gender = page.locator("label[for='gender-radio-3']");
        Locator mobile = page.getByPlaceholder("Mobile Number");
        Locator dateOfBirth_Input = page.locator("#dateOfBirthInput");
        Locator hobbies = page.locator("label[for='hobbies-checkbox-3']");
        Locator picture = page.locator("#uploadPicture");
        Locator currentAddress = page.getByPlaceholder("Current Address");
        Locator submit = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit"));


        firstName.fill("Yes");

        lastName.fill("Man");

        email.fill("YesMan21@themail.com");

        gender.scrollIntoViewIfNeeded();
        gender.check();

        mobile.fill("0829357892");

        // Clicks the Date of Birth Input
        dateOfBirth_Input.click();

        // Locate the year dropdown and select the year "1990"
        Locator yearDropdown = page.locator(".react-datepicker__year-select");
        yearDropdown.selectOption("1990");

        // Locate the month dropdown and select the month "March"
        Locator monthDropdown = page.locator(".react-datepicker__month-select");
        monthDropdown.selectOption("March");

        // Locate and click the day "12" on the calendar
        Locator dayElement = page.locator(".react-datepicker__day--012");
        dayElement.click();

        hobbies.check();

        picture.click();
        page.keyboard().press("Escape");

        currentAddress.fill("Somewhere in the wild Street.1");

        // Can not execute with the reason suspected being that the button is blocked by a ad
        //submit.click();

        
    }
}
