package Pages;

import org.openqa.selenium.support.PageFactory;

import static Utils.Hooks.driver;

public class SearchPage {



    public SearchPage() {
        PageFactory.initElements(driver, this);

    }

    public boolean userShouldViewTheMessage(String errormessage) {
        return driver.getPageSource().contains(errormessage);
    }

    public boolean IsTextPresent(String text) {
        return driver.getPageSource().contains(text);
    }
}
