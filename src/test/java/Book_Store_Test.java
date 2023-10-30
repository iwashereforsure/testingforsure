import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.Test;

public class Book_Store_Test extends TestBase{
    @Test
    void goBackAndForce(){
        String book_Store = "https://demoqa.com/login";
        page.navigate(book_Store);

        Locator userName = page.getByPlaceholder("UserName");
        Locator passWord = page.getByPlaceholder("Password");
        Locator logIn = page.locator("#login");

        Locator goToStore = page.locator("#gotoStore");

        Locator bookJava = page.locator("a:has-text('Speaking JavaScript')");
        Locator addBook = page.locator("text=Add To Your Collection");
        Locator returnProfile = page.locator("span:has-text(\"Profile\")");

        Locator deleteAllBooks = page.locator("(//button[@id='submit'])[3]");
        Locator deleteYes = page.locator("#closeSmallModal-ok");

        Locator logOut = page.locator("button:has-text('Log out')");


        //Note that depending on the situation, a account has to be made first
        userName.fill("yesman");
        passWord.fill("Abcd1234*");
        logIn.click();

        goToStore.click();

        bookJava.click();
        addBook.click();
        returnProfile.click();

        deleteAllBooks.click();
        deleteYes.click();

        logOut.click();


    }

}
