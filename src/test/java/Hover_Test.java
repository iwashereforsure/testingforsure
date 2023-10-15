import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.Test;

public class Hover_Test extends TestBase{
    @Test
    void goBackAndForce() {
        String menu = "https://demoqa.com/menu#";
        page.navigate(menu);

        String firstLocate = "Main Item 2";
        String secondLocate = "SUB SUB LIST »";
        String thirdLocate = "Sub Sub Item 1";

        Locator mainItem2 = page.locator("//*[text()='" + firstLocate + "']");
        Locator subSubList = page.locator("//*[text()='" + secondLocate + "']");
        Locator subSubItem1 = page.locator("//*[text()='" + thirdLocate + "']");

        mainItem2.hover();
        subSubList.hover();
        subSubItem1.hover();

    }
}
